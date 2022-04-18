// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VolumeAttachmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final VolumeAttachmentArgs Empty = new VolumeAttachmentArgs();

    /**
     * The device name to expose to the instance (for
     * example, `/dev/sdh` or `xvdh`).  See [Device Naming on Linux Instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html#available-ec2-device-names) and [Device Naming on Windows Instances](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/device_naming.html#available-ec2-device-names) for more information.
     * 
     */
    @Import(name="deviceName", required=true)
      private final Output<String> deviceName;

    public Output<String> deviceName() {
        return this.deviceName;
    }

    /**
     * Set to `true` if you want to force the
     * volume to detach. Useful if previous attempts failed, but use this option only
     * as a last resort, as this can result in **data loss**. See
     * [Detaching an Amazon EBS Volume from an Instance](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-detaching-volume.html) for more information.
     * 
     */
    @Import(name="forceDetach")
      private final @Nullable Output<Boolean> forceDetach;

    public Output<Boolean> forceDetach() {
        return this.forceDetach == null ? Codegen.empty() : this.forceDetach;
    }

    /**
     * ID of the Instance to attach to
     * 
     */
    @Import(name="instanceId", required=true)
      private final Output<String> instanceId;

    public Output<String> instanceId() {
        return this.instanceId;
    }

    /**
     * Set this to true if you do not wish
     * to detach the volume from the instance to which it is attached at destroy
     * time, and instead just remove the attachment from this provider state. This is
     * useful when destroying an instance which has volumes created by some other
     * means attached.
     * 
     */
    @Import(name="skipDestroy")
      private final @Nullable Output<Boolean> skipDestroy;

    public Output<Boolean> skipDestroy() {
        return this.skipDestroy == null ? Codegen.empty() : this.skipDestroy;
    }

    /**
     * Set this to true to ensure that the target instance is stopped
     * before trying to detach the volume. Stops the instance, if it is not already stopped.
     * 
     */
    @Import(name="stopInstanceBeforeDetaching")
      private final @Nullable Output<Boolean> stopInstanceBeforeDetaching;

    public Output<Boolean> stopInstanceBeforeDetaching() {
        return this.stopInstanceBeforeDetaching == null ? Codegen.empty() : this.stopInstanceBeforeDetaching;
    }

    /**
     * ID of the Volume to be attached
     * 
     */
    @Import(name="volumeId", required=true)
      private final Output<String> volumeId;

    public Output<String> volumeId() {
        return this.volumeId;
    }

    public VolumeAttachmentArgs(
        Output<String> deviceName,
        @Nullable Output<Boolean> forceDetach,
        Output<String> instanceId,
        @Nullable Output<Boolean> skipDestroy,
        @Nullable Output<Boolean> stopInstanceBeforeDetaching,
        Output<String> volumeId) {
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.forceDetach = forceDetach;
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.skipDestroy = skipDestroy;
        this.stopInstanceBeforeDetaching = stopInstanceBeforeDetaching;
        this.volumeId = Objects.requireNonNull(volumeId, "expected parameter 'volumeId' to be non-null");
    }

    private VolumeAttachmentArgs() {
        this.deviceName = Codegen.empty();
        this.forceDetach = Codegen.empty();
        this.instanceId = Codegen.empty();
        this.skipDestroy = Codegen.empty();
        this.stopInstanceBeforeDetaching = Codegen.empty();
        this.volumeId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> deviceName;
        private @Nullable Output<Boolean> forceDetach;
        private Output<String> instanceId;
        private @Nullable Output<Boolean> skipDestroy;
        private @Nullable Output<Boolean> stopInstanceBeforeDetaching;
        private Output<String> volumeId;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeAttachmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.forceDetach = defaults.forceDetach;
    	      this.instanceId = defaults.instanceId;
    	      this.skipDestroy = defaults.skipDestroy;
    	      this.stopInstanceBeforeDetaching = defaults.stopInstanceBeforeDetaching;
    	      this.volumeId = defaults.volumeId;
        }

        public Builder deviceName(Output<String> deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        public Builder deviceName(String deviceName) {
            this.deviceName = Output.of(Objects.requireNonNull(deviceName));
            return this;
        }
        public Builder forceDetach(@Nullable Output<Boolean> forceDetach) {
            this.forceDetach = forceDetach;
            return this;
        }
        public Builder forceDetach(@Nullable Boolean forceDetach) {
            this.forceDetach = Codegen.ofNullable(forceDetach);
            return this;
        }
        public Builder instanceId(Output<String> instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Output.of(Objects.requireNonNull(instanceId));
            return this;
        }
        public Builder skipDestroy(@Nullable Output<Boolean> skipDestroy) {
            this.skipDestroy = skipDestroy;
            return this;
        }
        public Builder skipDestroy(@Nullable Boolean skipDestroy) {
            this.skipDestroy = Codegen.ofNullable(skipDestroy);
            return this;
        }
        public Builder stopInstanceBeforeDetaching(@Nullable Output<Boolean> stopInstanceBeforeDetaching) {
            this.stopInstanceBeforeDetaching = stopInstanceBeforeDetaching;
            return this;
        }
        public Builder stopInstanceBeforeDetaching(@Nullable Boolean stopInstanceBeforeDetaching) {
            this.stopInstanceBeforeDetaching = Codegen.ofNullable(stopInstanceBeforeDetaching);
            return this;
        }
        public Builder volumeId(Output<String> volumeId) {
            this.volumeId = Objects.requireNonNull(volumeId);
            return this;
        }
        public Builder volumeId(String volumeId) {
            this.volumeId = Output.of(Objects.requireNonNull(volumeId));
            return this;
        }        public VolumeAttachmentArgs build() {
            return new VolumeAttachmentArgs(deviceName, forceDetach, instanceId, skipDestroy, stopInstanceBeforeDetaching, volumeId);
        }
    }
}
