package com.gdu.prj08.service;

import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.util.Map;
import java.util.Objects;

public interface UploadService {
  int upload1(MultipartHttpServletRequest multipartRequest);
  Map<String, Objects> upload2(MultipartHttpServletRequest multipartRequest);
}
