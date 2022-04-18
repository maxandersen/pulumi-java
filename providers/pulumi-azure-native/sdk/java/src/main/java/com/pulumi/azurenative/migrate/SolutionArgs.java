// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate;

import com.pulumi.azurenative.migrate.inputs.SolutionPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SolutionArgs extends com.pulumi.resources.ResourceArgs {

    public static final SolutionArgs Empty = new SolutionArgs();

    /**
     * Name of the Azure Migrate project.
     * 
     */
    @Import(name="migrateProjectName", required=true)
      private final Output<String> migrateProjectName;

    public Output<String> migrateProjectName() {
        return this.migrateProjectName;
    }

    /**
     * Gets or sets the properties of the solution.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<SolutionPropertiesArgs> properties;

    public Output<SolutionPropertiesArgs> properties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    /**
     * Name of the Azure Resource Group that migrate project is part of.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Unique name of a migration solution within a migrate project.
     * 
     */
    @Import(name="solutionName")
      private final @Nullable Output<String> solutionName;

    public Output<String> solutionName() {
        return this.solutionName == null ? Codegen.empty() : this.solutionName;
    }

    public SolutionArgs(
        Output<String> migrateProjectName,
        @Nullable Output<SolutionPropertiesArgs> properties,
        Output<String> resourceGroupName,
        @Nullable Output<String> solutionName) {
        this.migrateProjectName = Objects.requireNonNull(migrateProjectName, "expected parameter 'migrateProjectName' to be non-null");
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.solutionName = solutionName;
    }

    private SolutionArgs() {
        this.migrateProjectName = Codegen.empty();
        this.properties = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.solutionName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SolutionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> migrateProjectName;
        private @Nullable Output<SolutionPropertiesArgs> properties;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> solutionName;

        public Builder() {
    	      // Empty
        }

        public Builder(SolutionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.migrateProjectName = defaults.migrateProjectName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.solutionName = defaults.solutionName;
        }

        public Builder migrateProjectName(Output<String> migrateProjectName) {
            this.migrateProjectName = Objects.requireNonNull(migrateProjectName);
            return this;
        }
        public Builder migrateProjectName(String migrateProjectName) {
            this.migrateProjectName = Output.of(Objects.requireNonNull(migrateProjectName));
            return this;
        }
        public Builder properties(@Nullable Output<SolutionPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable SolutionPropertiesArgs properties) {
            this.properties = Codegen.ofNullable(properties);
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
        public Builder solutionName(@Nullable Output<String> solutionName) {
            this.solutionName = solutionName;
            return this;
        }
        public Builder solutionName(@Nullable String solutionName) {
            this.solutionName = Codegen.ofNullable(solutionName);
            return this;
        }        public SolutionArgs build() {
            return new SolutionArgs(migrateProjectName, properties, resourceGroupName, solutionName);
        }
    }
}
