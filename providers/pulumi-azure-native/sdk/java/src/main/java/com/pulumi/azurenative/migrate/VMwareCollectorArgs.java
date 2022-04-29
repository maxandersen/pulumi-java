// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate;

import com.pulumi.azurenative.migrate.inputs.CollectorPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VMwareCollectorArgs extends ResourceArgs {

    public static final VMwareCollectorArgs Empty = new VMwareCollectorArgs();

    @Import(name="eTag")
    private @Nullable Output<String> eTag;

    public Optional<Output<String>> eTag() {
        return Optional.ofNullable(this.eTag);
    }

    /**
     * Name of the Azure Migrate project.
     * 
     */
    @Import(name="projectName", required=true)
    private Output<String> projectName;

    /**
     * @return Name of the Azure Migrate project.
     * 
     */
    public Output<String> projectName() {
        return this.projectName;
    }

    @Import(name="properties")
    private @Nullable Output<CollectorPropertiesArgs> properties;

    public Optional<Output<CollectorPropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Name of the Azure Resource Group that project is part of.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the Azure Resource Group that project is part of.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Unique name of a VMware collector within a project.
     * 
     */
    @Import(name="vmWareCollectorName")
    private @Nullable Output<String> vmWareCollectorName;

    /**
     * @return Unique name of a VMware collector within a project.
     * 
     */
    public Optional<Output<String>> vmWareCollectorName() {
        return Optional.ofNullable(this.vmWareCollectorName);
    }

    private VMwareCollectorArgs() {}

    private VMwareCollectorArgs(VMwareCollectorArgs $) {
        this.eTag = $.eTag;
        this.projectName = $.projectName;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
        this.vmWareCollectorName = $.vmWareCollectorName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VMwareCollectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VMwareCollectorArgs $;

        public Builder() {
            $ = new VMwareCollectorArgs();
        }

        public Builder(VMwareCollectorArgs defaults) {
            $ = new VMwareCollectorArgs(Objects.requireNonNull(defaults));
        }

        public Builder eTag(@Nullable Output<String> eTag) {
            $.eTag = eTag;
            return this;
        }

        public Builder eTag(String eTag) {
            return eTag(Output.of(eTag));
        }

        /**
         * @param projectName Name of the Azure Migrate project.
         * 
         * @return builder
         * 
         */
        public Builder projectName(Output<String> projectName) {
            $.projectName = projectName;
            return this;
        }

        /**
         * @param projectName Name of the Azure Migrate project.
         * 
         * @return builder
         * 
         */
        public Builder projectName(String projectName) {
            return projectName(Output.of(projectName));
        }

        public Builder properties(@Nullable Output<CollectorPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        public Builder properties(CollectorPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param resourceGroupName Name of the Azure Resource Group that project is part of.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the Azure Resource Group that project is part of.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param vmWareCollectorName Unique name of a VMware collector within a project.
         * 
         * @return builder
         * 
         */
        public Builder vmWareCollectorName(@Nullable Output<String> vmWareCollectorName) {
            $.vmWareCollectorName = vmWareCollectorName;
            return this;
        }

        /**
         * @param vmWareCollectorName Unique name of a VMware collector within a project.
         * 
         * @return builder
         * 
         */
        public Builder vmWareCollectorName(String vmWareCollectorName) {
            return vmWareCollectorName(Output.of(vmWareCollectorName));
        }

        public VMwareCollectorArgs build() {
            $.projectName = Objects.requireNonNull($.projectName, "expected parameter 'projectName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
