// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * The deinterlacing mode. Defaults to AutoPixelAdaptive.
     * 
     */
    @EnumType
    public enum DeinterlaceMode {
        /**
         * Disables de-interlacing of the source video.
         * 
         */
        Off("Off"),
        /**
         * Apply automatic pixel adaptive de-interlacing on each frame in the input video.
         * 
         */
        AutoPixelAdaptive("AutoPixelAdaptive");

        private final String value;

        DeinterlaceMode(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "DeinterlaceMode[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
