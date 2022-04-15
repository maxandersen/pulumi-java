// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub;

import io.pulumi.azurenative.eventhub.enums.SchemaCompatibility;
import io.pulumi.azurenative.eventhub.enums.SchemaType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SchemaRegistryArgs extends io.pulumi.resources.ResourceArgs {

    public static final SchemaRegistryArgs Empty = new SchemaRegistryArgs();

    /**
     * dictionary object for SchemaGroup group properties
     * 
     */
    @Import(name="groupProperties")
      private final @Nullable Output<Map<String,String>> groupProperties;

    public Output<Map<String,String>> groupProperties() {
        return this.groupProperties == null ? Codegen.empty() : this.groupProperties;
    }

    /**
     * The Namespace name
     * 
     */
    @Import(name="namespaceName", required=true)
      private final Output<String> namespaceName;

    public Output<String> namespaceName() {
        return this.namespaceName;
    }

    /**
     * Name of the resource group within the azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    @Import(name="schemaCompatibility")
      private final @Nullable Output<Either<String,SchemaCompatibility>> schemaCompatibility;

    public Output<Either<String,SchemaCompatibility>> schemaCompatibility() {
        return this.schemaCompatibility == null ? Codegen.empty() : this.schemaCompatibility;
    }

    /**
     * The Schema Group name
     * 
     */
    @Import(name="schemaGroupName")
      private final @Nullable Output<String> schemaGroupName;

    public Output<String> schemaGroupName() {
        return this.schemaGroupName == null ? Codegen.empty() : this.schemaGroupName;
    }

    @Import(name="schemaType")
      private final @Nullable Output<Either<String,SchemaType>> schemaType;

    public Output<Either<String,SchemaType>> schemaType() {
        return this.schemaType == null ? Codegen.empty() : this.schemaType;
    }

    public SchemaRegistryArgs(
        @Nullable Output<Map<String,String>> groupProperties,
        Output<String> namespaceName,
        Output<String> resourceGroupName,
        @Nullable Output<Either<String,SchemaCompatibility>> schemaCompatibility,
        @Nullable Output<String> schemaGroupName,
        @Nullable Output<Either<String,SchemaType>> schemaType) {
        this.groupProperties = groupProperties;
        this.namespaceName = Objects.requireNonNull(namespaceName, "expected parameter 'namespaceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.schemaCompatibility = schemaCompatibility;
        this.schemaGroupName = schemaGroupName;
        this.schemaType = schemaType;
    }

    private SchemaRegistryArgs() {
        this.groupProperties = Codegen.empty();
        this.namespaceName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.schemaCompatibility = Codegen.empty();
        this.schemaGroupName = Codegen.empty();
        this.schemaType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchemaRegistryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> groupProperties;
        private Output<String> namespaceName;
        private Output<String> resourceGroupName;
        private @Nullable Output<Either<String,SchemaCompatibility>> schemaCompatibility;
        private @Nullable Output<String> schemaGroupName;
        private @Nullable Output<Either<String,SchemaType>> schemaType;

        public Builder() {
    	      // Empty
        }

        public Builder(SchemaRegistryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupProperties = defaults.groupProperties;
    	      this.namespaceName = defaults.namespaceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.schemaCompatibility = defaults.schemaCompatibility;
    	      this.schemaGroupName = defaults.schemaGroupName;
    	      this.schemaType = defaults.schemaType;
        }

        public Builder groupProperties(@Nullable Output<Map<String,String>> groupProperties) {
            this.groupProperties = groupProperties;
            return this;
        }
        public Builder groupProperties(@Nullable Map<String,String> groupProperties) {
            this.groupProperties = Codegen.ofNullable(groupProperties);
            return this;
        }
        public Builder namespaceName(Output<String> namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = Output.of(Objects.requireNonNull(namespaceName));
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
        public Builder schemaCompatibility(@Nullable Output<Either<String,SchemaCompatibility>> schemaCompatibility) {
            this.schemaCompatibility = schemaCompatibility;
            return this;
        }
        public Builder schemaCompatibility(@Nullable Either<String,SchemaCompatibility> schemaCompatibility) {
            this.schemaCompatibility = Codegen.ofNullable(schemaCompatibility);
            return this;
        }
        public Builder schemaGroupName(@Nullable Output<String> schemaGroupName) {
            this.schemaGroupName = schemaGroupName;
            return this;
        }
        public Builder schemaGroupName(@Nullable String schemaGroupName) {
            this.schemaGroupName = Codegen.ofNullable(schemaGroupName);
            return this;
        }
        public Builder schemaType(@Nullable Output<Either<String,SchemaType>> schemaType) {
            this.schemaType = schemaType;
            return this;
        }
        public Builder schemaType(@Nullable Either<String,SchemaType> schemaType) {
            this.schemaType = Codegen.ofNullable(schemaType);
            return this;
        }        public SchemaRegistryArgs build() {
            return new SchemaRegistryArgs(groupProperties, namespaceName, resourceGroupName, schemaCompatibility, schemaGroupName, schemaType);
        }
    }
}
