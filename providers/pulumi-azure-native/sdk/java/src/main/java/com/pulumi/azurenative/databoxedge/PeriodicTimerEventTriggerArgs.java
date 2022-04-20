// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge;

import com.pulumi.azurenative.databoxedge.inputs.PeriodicTimerSourceInfoArgs;
import com.pulumi.azurenative.databoxedge.inputs.RoleSinkInfoArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PeriodicTimerEventTriggerArgs extends com.pulumi.resources.ResourceArgs {

    public static final PeriodicTimerEventTriggerArgs Empty = new PeriodicTimerEventTriggerArgs();

    /**
     * A custom context tag typically used to correlate the trigger against its usage. For example, if a periodic timer trigger is intended for certain specific IoT modules in the device, the tag can be the name or the image URL of the module.
     * 
     */
    @Import(name="customContextTag")
      private final @Nullable Output<String> customContextTag;

    public Output<String> customContextTag() {
        return this.customContextTag == null ? Codegen.empty() : this.customContextTag;
    }

    /**
     * Creates or updates a trigger
     * 
     */
    @Import(name="deviceName", required=true)
      private final Output<String> deviceName;

    public Output<String> deviceName() {
        return this.deviceName;
    }

    /**
     * Trigger Kind.
     * Expected value is &#39;PeriodicTimerEvent&#39;.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> kind() {
        return this.kind;
    }

    /**
     * The trigger name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Role Sink information.
     * 
     */
    @Import(name="sinkInfo", required=true)
      private final Output<RoleSinkInfoArgs> sinkInfo;

    public Output<RoleSinkInfoArgs> sinkInfo() {
        return this.sinkInfo;
    }

    /**
     * Periodic timer details.
     * 
     */
    @Import(name="sourceInfo", required=true)
      private final Output<PeriodicTimerSourceInfoArgs> sourceInfo;

    public Output<PeriodicTimerSourceInfoArgs> sourceInfo() {
        return this.sourceInfo;
    }

    public PeriodicTimerEventTriggerArgs(
        @Nullable Output<String> customContextTag,
        Output<String> deviceName,
        Output<String> kind,
        @Nullable Output<String> name,
        Output<String> resourceGroupName,
        Output<RoleSinkInfoArgs> sinkInfo,
        Output<PeriodicTimerSourceInfoArgs> sourceInfo) {
        this.customContextTag = customContextTag;
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.kind = Codegen.stringProp("kind").output().arg(kind).require();
        this.name = name;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sinkInfo = Objects.requireNonNull(sinkInfo, "expected parameter 'sinkInfo' to be non-null");
        this.sourceInfo = Objects.requireNonNull(sourceInfo, "expected parameter 'sourceInfo' to be non-null");
    }

    private PeriodicTimerEventTriggerArgs() {
        this.customContextTag = Codegen.empty();
        this.deviceName = Codegen.empty();
        this.kind = Codegen.empty();
        this.name = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.sinkInfo = Codegen.empty();
        this.sourceInfo = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PeriodicTimerEventTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> customContextTag;
        private Output<String> deviceName;
        private Output<String> kind;
        private @Nullable Output<String> name;
        private Output<String> resourceGroupName;
        private Output<RoleSinkInfoArgs> sinkInfo;
        private Output<PeriodicTimerSourceInfoArgs> sourceInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(PeriodicTimerEventTriggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customContextTag = defaults.customContextTag;
    	      this.deviceName = defaults.deviceName;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sinkInfo = defaults.sinkInfo;
    	      this.sourceInfo = defaults.sourceInfo;
        }

        public Builder customContextTag(@Nullable Output<String> customContextTag) {
            this.customContextTag = customContextTag;
            return this;
        }
        public Builder customContextTag(@Nullable String customContextTag) {
            this.customContextTag = Codegen.ofNullable(customContextTag);
            return this;
        }
        public Builder deviceName(Output<String> deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        public Builder deviceName(String deviceName) {
            this.deviceName = Output.of(Objects.requireNonNull(deviceName));
            return this;
        }
        public Builder kind(Output<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder sinkInfo(Output<RoleSinkInfoArgs> sinkInfo) {
            this.sinkInfo = Objects.requireNonNull(sinkInfo);
            return this;
        }
        public Builder sinkInfo(RoleSinkInfoArgs sinkInfo) {
            this.sinkInfo = Output.of(Objects.requireNonNull(sinkInfo));
            return this;
        }
        public Builder sourceInfo(Output<PeriodicTimerSourceInfoArgs> sourceInfo) {
            this.sourceInfo = Objects.requireNonNull(sourceInfo);
            return this;
        }
        public Builder sourceInfo(PeriodicTimerSourceInfoArgs sourceInfo) {
            this.sourceInfo = Output.of(Objects.requireNonNull(sourceInfo));
            return this;
        }        public PeriodicTimerEventTriggerArgs build() {
            return new PeriodicTimerEventTriggerArgs(customContextTag, deviceName, kind, name, resourceGroupName, sinkInfo, sourceInfo);
        }
    }
}
