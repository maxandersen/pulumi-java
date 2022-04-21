// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceGroupManagerStatefulDiskArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceGroupManagerStatefulDiskArgs Empty = new InstanceGroupManagerStatefulDiskArgs();

    /**
     * , A value that prescribes what should happen to the stateful disk when the VM instance is deleted. The available options are `NEVER` and `ON_PERMANENT_INSTANCE_DELETION`. `NEVER` - detach the disk when the VM is deleted, but do not delete the disk. `ON_PERMANENT_INSTANCE_DELETION` will delete the stateful disk when the VM is permanently deleted from the instance group. The default is `NEVER`.
     * 
     */
    @Import(name="deleteRule")
    private @Nullable Output<String> deleteRule;

    public Optional<Output<String>> deleteRule() {
        return Optional.ofNullable(this.deleteRule);
    }

    /**
     * , The device name of the disk to be attached.
     * 
     */
    @Import(name="deviceName", required=true)
    private Output<String> deviceName;

    public Output<String> deviceName() {
        return this.deviceName;
    }

    private InstanceGroupManagerStatefulDiskArgs() {}

    private InstanceGroupManagerStatefulDiskArgs(InstanceGroupManagerStatefulDiskArgs $) {
        this.deleteRule = $.deleteRule;
        this.deviceName = $.deviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceGroupManagerStatefulDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceGroupManagerStatefulDiskArgs $;

        public Builder() {
            $ = new InstanceGroupManagerStatefulDiskArgs();
        }

        public Builder(InstanceGroupManagerStatefulDiskArgs defaults) {
            $ = new InstanceGroupManagerStatefulDiskArgs(Objects.requireNonNull(defaults));
        }

        public Builder deleteRule(@Nullable Output<String> deleteRule) {
            $.deleteRule = deleteRule;
            return this;
        }

        public Builder deleteRule(String deleteRule) {
            return deleteRule(Output.of(deleteRule));
        }

        public Builder deviceName(Output<String> deviceName) {
            $.deviceName = deviceName;
            return this;
        }

        public Builder deviceName(String deviceName) {
            return deviceName(Output.of(deviceName));
        }

        public InstanceGroupManagerStatefulDiskArgs build() {
            $.deviceName = Objects.requireNonNull($.deviceName, "expected parameter 'deviceName' to be non-null");
            return $;
        }
    }

}
