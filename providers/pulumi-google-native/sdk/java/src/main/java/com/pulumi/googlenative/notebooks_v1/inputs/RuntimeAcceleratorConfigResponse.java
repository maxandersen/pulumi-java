// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.notebooks_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Definition of the types of hardware accelerators that can be used. Definition of the types of hardware accelerators that can be used. See [Compute Engine AcceleratorTypes](https://cloud.google.com/compute/docs/reference/beta/acceleratorTypes). Examples: * `nvidia-tesla-k80` * `nvidia-tesla-p100` * `nvidia-tesla-v100` * `nvidia-tesla-p4` * `nvidia-tesla-t4` * `nvidia-tesla-a100`
 * 
 */
public final class RuntimeAcceleratorConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final RuntimeAcceleratorConfigResponse Empty = new RuntimeAcceleratorConfigResponse();

    /**
     * Count of cores of this accelerator.
     * 
     */
    @Import(name="coreCount", required=true)
    private String coreCount;

    public String coreCount() {
        return this.coreCount;
    }

    /**
     * Accelerator model.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private RuntimeAcceleratorConfigResponse() {}

    private RuntimeAcceleratorConfigResponse(RuntimeAcceleratorConfigResponse $) {
        this.coreCount = $.coreCount;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuntimeAcceleratorConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuntimeAcceleratorConfigResponse $;

        public Builder() {
            $ = new RuntimeAcceleratorConfigResponse();
        }

        public Builder(RuntimeAcceleratorConfigResponse defaults) {
            $ = new RuntimeAcceleratorConfigResponse(Objects.requireNonNull(defaults));
        }

        public Builder coreCount(String coreCount) {
            $.coreCount = coreCount;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public RuntimeAcceleratorConfigResponse build() {
            $.coreCount = Objects.requireNonNull($.coreCount, "expected parameter 'coreCount' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
