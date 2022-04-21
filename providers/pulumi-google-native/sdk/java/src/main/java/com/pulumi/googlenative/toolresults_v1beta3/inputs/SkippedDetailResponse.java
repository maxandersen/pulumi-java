// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.toolresults_v1beta3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Details for an outcome with a SKIPPED outcome summary.
 * 
 */
public final class SkippedDetailResponse extends com.pulumi.resources.InvokeArgs {

    public static final SkippedDetailResponse Empty = new SkippedDetailResponse();

    /**
     * If the App doesn&#39;t support the specific API level.
     * 
     */
    @Import(name="incompatibleAppVersion", required=true)
    private Boolean incompatibleAppVersion;

    public Boolean incompatibleAppVersion() {
        return this.incompatibleAppVersion;
    }

    /**
     * If the App doesn&#39;t run on the specific architecture, for example, x86.
     * 
     */
    @Import(name="incompatibleArchitecture", required=true)
    private Boolean incompatibleArchitecture;

    public Boolean incompatibleArchitecture() {
        return this.incompatibleArchitecture;
    }

    /**
     * If the requested OS version doesn&#39;t run on the specific device model.
     * 
     */
    @Import(name="incompatibleDevice", required=true)
    private Boolean incompatibleDevice;

    public Boolean incompatibleDevice() {
        return this.incompatibleDevice;
    }

    private SkippedDetailResponse() {}

    private SkippedDetailResponse(SkippedDetailResponse $) {
        this.incompatibleAppVersion = $.incompatibleAppVersion;
        this.incompatibleArchitecture = $.incompatibleArchitecture;
        this.incompatibleDevice = $.incompatibleDevice;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SkippedDetailResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SkippedDetailResponse $;

        public Builder() {
            $ = new SkippedDetailResponse();
        }

        public Builder(SkippedDetailResponse defaults) {
            $ = new SkippedDetailResponse(Objects.requireNonNull(defaults));
        }

        public Builder incompatibleAppVersion(Boolean incompatibleAppVersion) {
            $.incompatibleAppVersion = incompatibleAppVersion;
            return this;
        }

        public Builder incompatibleArchitecture(Boolean incompatibleArchitecture) {
            $.incompatibleArchitecture = incompatibleArchitecture;
            return this;
        }

        public Builder incompatibleDevice(Boolean incompatibleDevice) {
            $.incompatibleDevice = incompatibleDevice;
            return this;
        }

        public SkippedDetailResponse build() {
            $.incompatibleAppVersion = Objects.requireNonNull($.incompatibleAppVersion, "expected parameter 'incompatibleAppVersion' to be non-null");
            $.incompatibleArchitecture = Objects.requireNonNull($.incompatibleArchitecture, "expected parameter 'incompatibleArchitecture' to be non-null");
            $.incompatibleDevice = Objects.requireNonNull($.incompatibleDevice, "expected parameter 'incompatibleDevice' to be non-null");
            return $;
        }
    }

}
