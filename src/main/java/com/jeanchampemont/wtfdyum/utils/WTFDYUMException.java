/*
 * Copyright (C) 2015, 2016 WTFDYUM
 *
 * This file is part of the WTFDYUM project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jeanchampemont.wtfdyum.utils;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * The Class WTFDYUMException. This class simply wrap exceptions.
 */
@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "WTFDYUMException")
public class WTFDYUMException extends Exception {

    private static final long serialVersionUID = 4147162490508812242L;

    public WTFDYUMException(final Exception e, final WTFDYUMExceptionType type) {
        super(e);
        this.type = type;
    }

    public WTFDYUMException(final WTFDYUMExceptionType type) {
        this.type = type;
    }

    private final WTFDYUMExceptionType type;

    public WTFDYUMExceptionType getType() {
        return type;
    }

}
