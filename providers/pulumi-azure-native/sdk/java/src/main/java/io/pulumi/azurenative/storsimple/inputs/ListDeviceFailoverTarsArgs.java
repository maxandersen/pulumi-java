// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListDeviceFailoverTarsArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListDeviceFailoverTarsArgs Empty = new ListDeviceFailoverTarsArgs();

    /**
     * The manager name
     * 
     */
    @Import(name="managerName", required=true)
      private final String managerName;

    public String managerName() {
        return this.managerName;
    }

    /**
     * The resource group name
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The source device name on which failover is performed.
     * 
     */
    @Import(name="sourceDeviceName", required=true)
      private final String sourceDeviceName;

    public String sourceDeviceName() {
        return this.sourceDeviceName;
    }

    /**
     * The list of path IDs of the volume containers that needs to be failed-over, for which we want to fetch the eligible targets.
     * 
     */
    @Import(name="volumeContainers")
      private final @Nullable List<String> volumeContainers;

    public List<String> volumeContainers() {
        return this.volumeContainers == null ? List.of() : this.volumeContainers;
    }

    public ListDeviceFailoverTarsArgs(
        String managerName,
        String resourceGroupName,
        String sourceDeviceName,
        @Nullable List<String> volumeContainers) {
        this.managerName = Objects.requireNonNull(managerName, "expected parameter 'managerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sourceDeviceName = Objects.requireNonNull(sourceDeviceName, "expected parameter 'sourceDeviceName' to be non-null");
        this.volumeContainers = volumeContainers;
    }

    private ListDeviceFailoverTarsArgs() {
        this.managerName = null;
        this.resourceGroupName = null;
        this.sourceDeviceName = null;
        this.volumeContainers = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListDeviceFailoverTarsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String managerName;
        private String resourceGroupName;
        private String sourceDeviceName;
        private @Nullable List<String> volumeContainers;

        public Builder() {
    	      // Empty
        }

        public Builder(ListDeviceFailoverTarsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managerName = defaults.managerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sourceDeviceName = defaults.sourceDeviceName;
    	      this.volumeContainers = defaults.volumeContainers;
        }

        public Builder managerName(String managerName) {
            this.managerName = Objects.requireNonNull(managerName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder sourceDeviceName(String sourceDeviceName) {
            this.sourceDeviceName = Objects.requireNonNull(sourceDeviceName);
            return this;
        }
        public Builder volumeContainers(@Nullable List<String> volumeContainers) {
            this.volumeContainers = volumeContainers;
            return this;
        }
        public Builder volumeContainers(String... volumeContainers) {
            return volumeContainers(List.of(volumeContainers));
        }        public ListDeviceFailoverTarsArgs build() {
            return new ListDeviceFailoverTarsArgs(managerName, resourceGroupName, sourceDeviceName, volumeContainers);
        }
    }
}
