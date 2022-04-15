// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CodeVersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final CodeVersionArgs Empty = new CodeVersionArgs();

    /**
     * Container name.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Additional attributes of the entity.
     * 
     */
    @Import(name="properties", required=true)
      private final Output<io.pulumi.azurenative.machinelearningservices.inputs.CodeVersionArgs> properties;

    public Output<io.pulumi.azurenative.machinelearningservices.inputs.CodeVersionArgs> properties() {
        return this.properties;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Version identifier.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> version() {
        return this.version == null ? Codegen.empty() : this.version;
    }

    /**
     * Name of Azure Machine Learning workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
      private final Output<String> workspaceName;

    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    public CodeVersionArgs(
        Output<String> name,
        Output<io.pulumi.azurenative.machinelearningservices.inputs.CodeVersionArgs> properties,
        Output<String> resourceGroupName,
        @Nullable Output<String> version,
        Output<String> workspaceName) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.version = version;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private CodeVersionArgs() {
        this.name = Codegen.empty();
        this.properties = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.version = Codegen.empty();
        this.workspaceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CodeVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private Output<io.pulumi.azurenative.machinelearningservices.inputs.CodeVersionArgs> properties;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> version;
        private Output<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(CodeVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.version = defaults.version;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder properties(Output<io.pulumi.azurenative.machinelearningservices.inputs.CodeVersionArgs> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder properties(io.pulumi.azurenative.machinelearningservices.inputs.CodeVersionArgs properties) {
            this.properties = Output.of(Objects.requireNonNull(properties));
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
        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = Codegen.ofNullable(version);
            return this;
        }
        public Builder workspaceName(Output<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Output.of(Objects.requireNonNull(workspaceName));
            return this;
        }        public CodeVersionArgs build() {
            return new CodeVersionArgs(name, properties, resourceGroupName, version, workspaceName);
        }
    }
}
