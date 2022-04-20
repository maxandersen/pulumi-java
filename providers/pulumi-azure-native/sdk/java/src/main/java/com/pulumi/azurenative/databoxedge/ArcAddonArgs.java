// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ArcAddonArgs extends com.pulumi.resources.ResourceArgs {

    public static final ArcAddonArgs Empty = new ArcAddonArgs();

    /**
     * The addon name.
     * 
     */
    @Import(name="addonName")
      private final @Nullable Output<String> addonName;

    public Output<String> addonName() {
        return this.addonName == null ? Codegen.empty() : this.addonName;
    }

    /**
     * The device name.
     * 
     */
    @Import(name="deviceName", required=true)
      private final Output<String> deviceName;

    public Output<String> deviceName() {
        return this.deviceName;
    }

    /**
     * Addon type.
     * Expected value is &#39;ArcForKubernetes&#39;.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> kind() {
        return this.kind;
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
     * Arc resource location
     * 
     */
    @Import(name="resourceLocation", required=true)
      private final Output<String> resourceLocation;

    public Output<String> resourceLocation() {
        return this.resourceLocation;
    }

    /**
     * Arc resource Name
     * 
     */
    @Import(name="resourceName", required=true)
      private final Output<String> resourceName;

    public Output<String> resourceName() {
        return this.resourceName;
    }

    /**
     * The role name.
     * 
     */
    @Import(name="roleName", required=true)
      private final Output<String> roleName;

    public Output<String> roleName() {
        return this.roleName;
    }

    /**
     * Arc resource subscription Id
     * 
     */
    @Import(name="subscriptionId", required=true)
      private final Output<String> subscriptionId;

    public Output<String> subscriptionId() {
        return this.subscriptionId;
    }

    public ArcAddonArgs(
        @Nullable Output<String> addonName,
        Output<String> deviceName,
        Output<String> kind,
        Output<String> resourceGroupName,
        Output<String> resourceLocation,
        Output<String> resourceName,
        Output<String> roleName,
        Output<String> subscriptionId) {
        this.addonName = addonName;
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.kind = Codegen.stringProp("kind").output().arg(kind).require();
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceLocation = Objects.requireNonNull(resourceLocation, "expected parameter 'resourceLocation' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
        this.roleName = Objects.requireNonNull(roleName, "expected parameter 'roleName' to be non-null");
        this.subscriptionId = Objects.requireNonNull(subscriptionId, "expected parameter 'subscriptionId' to be non-null");
    }

    private ArcAddonArgs() {
        this.addonName = Codegen.empty();
        this.deviceName = Codegen.empty();
        this.kind = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.resourceLocation = Codegen.empty();
        this.resourceName = Codegen.empty();
        this.roleName = Codegen.empty();
        this.subscriptionId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ArcAddonArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> addonName;
        private Output<String> deviceName;
        private Output<String> kind;
        private Output<String> resourceGroupName;
        private Output<String> resourceLocation;
        private Output<String> resourceName;
        private Output<String> roleName;
        private Output<String> subscriptionId;

        public Builder() {
    	      // Empty
        }

        public Builder(ArcAddonArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addonName = defaults.addonName;
    	      this.deviceName = defaults.deviceName;
    	      this.kind = defaults.kind;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceLocation = defaults.resourceLocation;
    	      this.resourceName = defaults.resourceName;
    	      this.roleName = defaults.roleName;
    	      this.subscriptionId = defaults.subscriptionId;
        }

        public Builder addonName(@Nullable Output<String> addonName) {
            this.addonName = addonName;
            return this;
        }
        public Builder addonName(@Nullable String addonName) {
            this.addonName = Codegen.ofNullable(addonName);
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
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder resourceLocation(Output<String> resourceLocation) {
            this.resourceLocation = Objects.requireNonNull(resourceLocation);
            return this;
        }
        public Builder resourceLocation(String resourceLocation) {
            this.resourceLocation = Output.of(Objects.requireNonNull(resourceLocation));
            return this;
        }
        public Builder resourceName(Output<String> resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }
        public Builder resourceName(String resourceName) {
            this.resourceName = Output.of(Objects.requireNonNull(resourceName));
            return this;
        }
        public Builder roleName(Output<String> roleName) {
            this.roleName = Objects.requireNonNull(roleName);
            return this;
        }
        public Builder roleName(String roleName) {
            this.roleName = Output.of(Objects.requireNonNull(roleName));
            return this;
        }
        public Builder subscriptionId(Output<String> subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = Output.of(Objects.requireNonNull(subscriptionId));
            return this;
        }        public ArcAddonArgs build() {
            return new ArcAddonArgs(addonName, deviceName, kind, resourceGroupName, resourceLocation, resourceName, roleName, subscriptionId);
        }
    }
}
