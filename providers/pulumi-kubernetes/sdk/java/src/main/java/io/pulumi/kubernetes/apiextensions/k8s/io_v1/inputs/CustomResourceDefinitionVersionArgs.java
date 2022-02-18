// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiextensions.k8s.io_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1.inputs.CustomResourceColumnDefinitionArgs;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1.inputs.CustomResourceSubresourcesArgs;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1.inputs.CustomResourceValidationArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * CustomResourceDefinitionVersion describes a version for CRD.
 * 
 */
public final class CustomResourceDefinitionVersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomResourceDefinitionVersionArgs Empty = new CustomResourceDefinitionVersionArgs();

    /**
     * additionalPrinterColumns specifies additional columns returned in Table output. See https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables for details. If no columns are specified, a single column displaying the age of the custom resource is used.
     * 
     */
    @InputImport(name="additionalPrinterColumns")
    private final @Nullable Input<List<CustomResourceColumnDefinitionArgs>> additionalPrinterColumns;

    public Input<List<CustomResourceColumnDefinitionArgs>> getAdditionalPrinterColumns() {
        return this.additionalPrinterColumns == null ? Input.empty() : this.additionalPrinterColumns;
    }

    /**
     * deprecated indicates this version of the custom resource API is deprecated. When set to true, API requests to this version receive a warning header in the server response. Defaults to false.
     * 
     */
    @InputImport(name="deprecated")
    private final @Nullable Input<Boolean> deprecated;

    public Input<Boolean> getDeprecated() {
        return this.deprecated == null ? Input.empty() : this.deprecated;
    }

    /**
     * deprecationWarning overrides the default warning returned to API clients. May only be set when `deprecated` is true. The default warning indicates this version is deprecated and recommends use of the newest served version of equal or greater stability, if one exists.
     * 
     */
    @InputImport(name="deprecationWarning")
    private final @Nullable Input<String> deprecationWarning;

    public Input<String> getDeprecationWarning() {
        return this.deprecationWarning == null ? Input.empty() : this.deprecationWarning;
    }

    /**
     * name is the version name, e.g. “v1”, “v2beta1”, etc. The custom resources are served under this version at `/apis/<group>/<version>/...` if `served` is true.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * schema describes the schema used for validation, pruning, and defaulting of this version of the custom resource.
     * 
     */
    @InputImport(name="schema")
    private final @Nullable Input<CustomResourceValidationArgs> schema;

    public Input<CustomResourceValidationArgs> getSchema() {
        return this.schema == null ? Input.empty() : this.schema;
    }

    /**
     * served is a flag enabling/disabling this version from being served via REST APIs
     * 
     */
    @InputImport(name="served", required=true)
    private final Input<Boolean> served;

    public Input<Boolean> getServed() {
        return this.served;
    }

    /**
     * storage indicates this version should be used when persisting custom resources to storage. There must be exactly one version with storage=true.
     * 
     */
    @InputImport(name="storage", required=true)
    private final Input<Boolean> storage;

    public Input<Boolean> getStorage() {
        return this.storage;
    }

    /**
     * subresources specify what subresources this version of the defined custom resource have.
     * 
     */
    @InputImport(name="subresources")
    private final @Nullable Input<CustomResourceSubresourcesArgs> subresources;

    public Input<CustomResourceSubresourcesArgs> getSubresources() {
        return this.subresources == null ? Input.empty() : this.subresources;
    }

    public CustomResourceDefinitionVersionArgs(
        @Nullable Input<List<CustomResourceColumnDefinitionArgs>> additionalPrinterColumns,
        @Nullable Input<Boolean> deprecated,
        @Nullable Input<String> deprecationWarning,
        Input<String> name,
        @Nullable Input<CustomResourceValidationArgs> schema,
        Input<Boolean> served,
        Input<Boolean> storage,
        @Nullable Input<CustomResourceSubresourcesArgs> subresources) {
        this.additionalPrinterColumns = additionalPrinterColumns;
        this.deprecated = deprecated;
        this.deprecationWarning = deprecationWarning;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.schema = schema;
        this.served = Objects.requireNonNull(served, "expected parameter 'served' to be non-null");
        this.storage = Objects.requireNonNull(storage, "expected parameter 'storage' to be non-null");
        this.subresources = subresources;
    }

    private CustomResourceDefinitionVersionArgs() {
        this.additionalPrinterColumns = Input.empty();
        this.deprecated = Input.empty();
        this.deprecationWarning = Input.empty();
        this.name = Input.empty();
        this.schema = Input.empty();
        this.served = Input.empty();
        this.storage = Input.empty();
        this.subresources = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceDefinitionVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<CustomResourceColumnDefinitionArgs>> additionalPrinterColumns;
        private @Nullable Input<Boolean> deprecated;
        private @Nullable Input<String> deprecationWarning;
        private Input<String> name;
        private @Nullable Input<CustomResourceValidationArgs> schema;
        private Input<Boolean> served;
        private Input<Boolean> storage;
        private @Nullable Input<CustomResourceSubresourcesArgs> subresources;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomResourceDefinitionVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalPrinterColumns = defaults.additionalPrinterColumns;
    	      this.deprecated = defaults.deprecated;
    	      this.deprecationWarning = defaults.deprecationWarning;
    	      this.name = defaults.name;
    	      this.schema = defaults.schema;
    	      this.served = defaults.served;
    	      this.storage = defaults.storage;
    	      this.subresources = defaults.subresources;
        }

        public Builder setAdditionalPrinterColumns(@Nullable Input<List<CustomResourceColumnDefinitionArgs>> additionalPrinterColumns) {
            this.additionalPrinterColumns = additionalPrinterColumns;
            return this;
        }

        public Builder setAdditionalPrinterColumns(@Nullable List<CustomResourceColumnDefinitionArgs> additionalPrinterColumns) {
            this.additionalPrinterColumns = Input.ofNullable(additionalPrinterColumns);
            return this;
        }

        public Builder setDeprecated(@Nullable Input<Boolean> deprecated) {
            this.deprecated = deprecated;
            return this;
        }

        public Builder setDeprecated(@Nullable Boolean deprecated) {
            this.deprecated = Input.ofNullable(deprecated);
            return this;
        }

        public Builder setDeprecationWarning(@Nullable Input<String> deprecationWarning) {
            this.deprecationWarning = deprecationWarning;
            return this;
        }

        public Builder setDeprecationWarning(@Nullable String deprecationWarning) {
            this.deprecationWarning = Input.ofNullable(deprecationWarning);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setSchema(@Nullable Input<CustomResourceValidationArgs> schema) {
            this.schema = schema;
            return this;
        }

        public Builder setSchema(@Nullable CustomResourceValidationArgs schema) {
            this.schema = Input.ofNullable(schema);
            return this;
        }

        public Builder setServed(Input<Boolean> served) {
            this.served = Objects.requireNonNull(served);
            return this;
        }

        public Builder setServed(Boolean served) {
            this.served = Input.of(Objects.requireNonNull(served));
            return this;
        }

        public Builder setStorage(Input<Boolean> storage) {
            this.storage = Objects.requireNonNull(storage);
            return this;
        }

        public Builder setStorage(Boolean storage) {
            this.storage = Input.of(Objects.requireNonNull(storage));
            return this;
        }

        public Builder setSubresources(@Nullable Input<CustomResourceSubresourcesArgs> subresources) {
            this.subresources = subresources;
            return this;
        }

        public Builder setSubresources(@Nullable CustomResourceSubresourcesArgs subresources) {
            this.subresources = Input.ofNullable(subresources);
            return this;
        }

        public CustomResourceDefinitionVersionArgs build() {
            return new CustomResourceDefinitionVersionArgs(additionalPrinterColumns, deprecated, deprecationWarning, name, schema, served, storage, subresources);
        }
    }
}
