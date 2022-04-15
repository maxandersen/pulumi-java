// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetIoTAddonArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetIoTAddonArgs Empty = new GetIoTAddonArgs();

    /**
     * The addon name.
     * 
     */
    @Import(name="addonName", required=true)
      private final String addonName;

    public String addonName() {
        return this.addonName;
    }

    /**
     * The device name.
     * 
     */
    @Import(name="deviceName", required=true)
      private final String deviceName;

    public String deviceName() {
        return this.deviceName;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The role name.
     * 
     */
    @Import(name="roleName", required=true)
      private final String roleName;

    public String roleName() {
        return this.roleName;
    }

    public GetIoTAddonArgs(
        String addonName,
        String deviceName,
        String resourceGroupName,
        String roleName) {
        this.addonName = Objects.requireNonNull(addonName, "expected parameter 'addonName' to be non-null");
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.roleName = Objects.requireNonNull(roleName, "expected parameter 'roleName' to be non-null");
    }

    private GetIoTAddonArgs() {
        this.addonName = null;
        this.deviceName = null;
        this.resourceGroupName = null;
        this.roleName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIoTAddonArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String addonName;
        private String deviceName;
        private String resourceGroupName;
        private String roleName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIoTAddonArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addonName = defaults.addonName;
    	      this.deviceName = defaults.deviceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.roleName = defaults.roleName;
        }

        public Builder addonName(String addonName) {
            this.addonName = Objects.requireNonNull(addonName);
            return this;
        }
        public Builder deviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder roleName(String roleName) {
            this.roleName = Objects.requireNonNull(roleName);
            return this;
        }        public GetIoTAddonArgs build() {
            return new GetIoTAddonArgs(addonName, deviceName, resourceGroupName, roleName);
        }
    }
}
