package xyz.sallai.r1.controller;

import android.os.Environment;
import android.util.Log;

import com.tencent.bugly.crashreport.CrashReport;
import com.unisound.vui.util.ShellUtils;
import com.yanzhenjie.andserver.annotation.CrossOrigin;
import com.yanzhenjie.andserver.annotation.GetMapping;
import com.yanzhenjie.andserver.annotation.PathVariable;
import com.yanzhenjie.andserver.annotation.PostMapping;
import com.yanzhenjie.andserver.annotation.RequestMapping;
import com.yanzhenjie.andserver.annotation.RequestParam;
import com.yanzhenjie.andserver.annotation.RestController;
import com.yanzhenjie.andserver.http.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

import xyz.sallai.r1.module.vo.sys.BaseSysInfoVo;
import xyz.sallai.r1.service.SystemService;
import xyz.sallai.r1.utils.RR;

/**
 * Description: [对类的简单描述]
 * <p>
 * Author: sallai
 * Date: 2023/5/13
 */
@RestController
@RequestMapping("/_api/sys")
@CrossOrigin
public class SystemController {

    private static final String TAG = "SystemController";

    @GetMapping("/info")
    public RR getSysInfo() {
        SystemService systemService = new SystemService();
        BaseSysInfoVo systemBaseInfo = systemService.getSystemBaseInfo();
        return RR.ok(systemBaseInfo);
    }
    @GetMapping("/screen/{start}")
    public RR changeScrcpy(@PathVariable("start") String start,@RequestParam(value = "freq",required = false) String freq,
                @RequestParam(value = "quality",required = false) String quality) {
        if("start".equals(start)) {
            long aLong = Long.parseLong(freq);
            int aQuality = Integer.parseInt(quality);
            SystemService.startScreenSend(aLong,aQuality);
        }
        else if ("stop".equals(start)) {
            SystemService.stopScreenSend();
        }else {
            Log.i(TAG, "getScreenBitMap: no option:" + start);
            return RR.error(201, "no option:" + start);
        }
        return RR.ok();
    }

    @GetMapping("/cmd")
    public RR execCmdMethod(@RequestParam("cmd") String cmd) {
        ShellUtils.CommandResult commandResult = ShellUtils.execCommand(cmd, false);
        return RR.ok(commandResult.toString());
    }

    @PostMapping("/upload")
    public void uploadFile(@RequestParam(name = "file") MultipartFile file,@RequestParam("path") String path) throws IOException {
        File rootDirectory = Environment.getRootDirectory();
        Log.i(TAG, "uploadFile: root" +rootDirectory.getPath());
        File extFile = Environment.getExternalStorageDirectory();
        Log.i(TAG, "uploadFile: extFile" +extFile.getPath());
        File newFile = new File(path);
        file.transferTo(newFile);
    }

    @GetMapping("/crash")
    public void crash() {
        CrashReport.testJavaCrash();
    }
}
