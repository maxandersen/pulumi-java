// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * AttachedVolume describes a volume attached to a node
 * 
 */
public final class AttachedVolumeArgs extends com.pulumi.resources.ResourceArgs {

    public static final AttachedVolumeArgs Empty = new AttachedVolumeArgs();

    /**
     * DevicePath represents the device path where the volume should be available
     * 
     */
    @Import(name="devicePath", required=true)
    private Output<String> devicePath;

    public Output<String> devicePath() {
        return this.devicePath;
    }

    /**
     * Name of the attached volume
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    private AttachedVolumeArgs() {}

    private AttachedVolumeArgs(AttachedVolumeArgs $) {
        this.devicePath = $.devicePath;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AttachedVolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AttachedVolumeArgs $;

        public Builder() {
            $ = new AttachedVolumeArgs();
        }

        public Builder(AttachedVolumeArgs defaults) {
            $ = new AttachedVolumeArgs(Objects.requireNonNull(defaults));
        }

        public Builder devicePath(Output<String> devicePath) {
            $.devicePath = devicePath;
            return this;
        }

        public Builder devicePath(String devicePath) {
            return devicePath(Output.of(devicePath));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public AttachedVolumeArgs build() {
            $.devicePath = Objects.requireNonNull($.devicePath, "expected parameter 'devicePath' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
