// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.azurenative.automation.inputs.ContentSourceArgs;
import io.pulumi.azurenative.automation.inputs.DscConfigurationAssociationPropertyArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DscNodeConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DscNodeConfigurationArgs Empty = new DscNodeConfigurationArgs();

    /**
     * The name of the automation account.
     * 
     */
    @Import(name="automationAccountName", required=true)
      private final Output<String> automationAccountName;

    public Output<String> automationAccountName() {
        return this.automationAccountName;
    }

    /**
     * Gets or sets the configuration of the node.
     * 
     */
    @Import(name="configuration", required=true)
      private final Output<DscConfigurationAssociationPropertyArgs> configuration;

    public Output<DscConfigurationAssociationPropertyArgs> configuration() {
        return this.configuration;
    }

    /**
     * If a new build version of NodeConfiguration is required.
     * 
     */
    @Import(name="incrementNodeConfigurationBuild")
      private final @Nullable Output<Boolean> incrementNodeConfigurationBuild;

    public Output<Boolean> incrementNodeConfigurationBuild() {
        return this.incrementNodeConfigurationBuild == null ? Codegen.empty() : this.incrementNodeConfigurationBuild;
    }

    /**
     * Name of the node configuration.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The Dsc node configuration name.
     * 
     */
    @Import(name="nodeConfigurationName")
      private final @Nullable Output<String> nodeConfigurationName;

    public Output<String> nodeConfigurationName() {
        return this.nodeConfigurationName == null ? Codegen.empty() : this.nodeConfigurationName;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Gets or sets the source.
     * 
     */
    @Import(name="source", required=true)
      private final Output<ContentSourceArgs> source;

    public Output<ContentSourceArgs> source() {
        return this.source;
    }

    /**
     * Gets or sets the tags attached to the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public DscNodeConfigurationArgs(
        Output<String> automationAccountName,
        Output<DscConfigurationAssociationPropertyArgs> configuration,
        @Nullable Output<Boolean> incrementNodeConfigurationBuild,
        @Nullable Output<String> name,
        @Nullable Output<String> nodeConfigurationName,
        Output<String> resourceGroupName,
        Output<ContentSourceArgs> source,
        @Nullable Output<Map<String,String>> tags) {
        this.automationAccountName = Objects.requireNonNull(automationAccountName, "expected parameter 'automationAccountName' to be non-null");
        this.configuration = Objects.requireNonNull(configuration, "expected parameter 'configuration' to be non-null");
        this.incrementNodeConfigurationBuild = incrementNodeConfigurationBuild;
        this.name = name;
        this.nodeConfigurationName = nodeConfigurationName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
        this.tags = tags;
    }

    private DscNodeConfigurationArgs() {
        this.automationAccountName = Codegen.empty();
        this.configuration = Codegen.empty();
        this.incrementNodeConfigurationBuild = Codegen.empty();
        this.name = Codegen.empty();
        this.nodeConfigurationName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.source = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DscNodeConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> automationAccountName;
        private Output<DscConfigurationAssociationPropertyArgs> configuration;
        private @Nullable Output<Boolean> incrementNodeConfigurationBuild;
        private @Nullable Output<String> name;
        private @Nullable Output<String> nodeConfigurationName;
        private Output<String> resourceGroupName;
        private Output<ContentSourceArgs> source;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DscNodeConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automationAccountName = defaults.automationAccountName;
    	      this.configuration = defaults.configuration;
    	      this.incrementNodeConfigurationBuild = defaults.incrementNodeConfigurationBuild;
    	      this.name = defaults.name;
    	      this.nodeConfigurationName = defaults.nodeConfigurationName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.source = defaults.source;
    	      this.tags = defaults.tags;
        }

        public Builder automationAccountName(Output<String> automationAccountName) {
            this.automationAccountName = Objects.requireNonNull(automationAccountName);
            return this;
        }
        public Builder automationAccountName(String automationAccountName) {
            this.automationAccountName = Output.of(Objects.requireNonNull(automationAccountName));
            return this;
        }
        public Builder configuration(Output<DscConfigurationAssociationPropertyArgs> configuration) {
            this.configuration = Objects.requireNonNull(configuration);
            return this;
        }
        public Builder configuration(DscConfigurationAssociationPropertyArgs configuration) {
            this.configuration = Output.of(Objects.requireNonNull(configuration));
            return this;
        }
        public Builder incrementNodeConfigurationBuild(@Nullable Output<Boolean> incrementNodeConfigurationBuild) {
            this.incrementNodeConfigurationBuild = incrementNodeConfigurationBuild;
            return this;
        }
        public Builder incrementNodeConfigurationBuild(@Nullable Boolean incrementNodeConfigurationBuild) {
            this.incrementNodeConfigurationBuild = Codegen.ofNullable(incrementNodeConfigurationBuild);
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
        public Builder nodeConfigurationName(@Nullable Output<String> nodeConfigurationName) {
            this.nodeConfigurationName = nodeConfigurationName;
            return this;
        }
        public Builder nodeConfigurationName(@Nullable String nodeConfigurationName) {
            this.nodeConfigurationName = Codegen.ofNullable(nodeConfigurationName);
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
        public Builder source(Output<ContentSourceArgs> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public Builder source(ContentSourceArgs source) {
            this.source = Output.of(Objects.requireNonNull(source));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public DscNodeConfigurationArgs build() {
            return new DscNodeConfigurationArgs(automationAccountName, configuration, incrementNodeConfigurationBuild, name, nodeConfigurationName, resourceGroupName, source, tags);
        }
    }
}
