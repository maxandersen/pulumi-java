// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Guest OS features.
 * 
 */
public final class GuestOsFeatureResponse extends com.pulumi.resources.InvokeArgs {

    public static final GuestOsFeatureResponse Empty = new GuestOsFeatureResponse();

    /**
     * The ID of a supported feature. To add multiple values, use commas to separate values. Set to one or more of the following values: - VIRTIO_SCSI_MULTIQUEUE - WINDOWS - MULTI_IP_SUBNET - UEFI_COMPATIBLE - SECURE_BOOT - GVNIC - SEV_CAPABLE - SUSPEND_RESUME_COMPATIBLE For more information, see Enabling guest operating system features.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private GuestOsFeatureResponse() {}

    private GuestOsFeatureResponse(GuestOsFeatureResponse $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GuestOsFeatureResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GuestOsFeatureResponse $;

        public Builder() {
            $ = new GuestOsFeatureResponse();
        }

        public Builder(GuestOsFeatureResponse defaults) {
            $ = new GuestOsFeatureResponse(Objects.requireNonNull(defaults));
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public GuestOsFeatureResponse build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
