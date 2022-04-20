// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.outputs.CustomResourceColumnDefinition;
import com.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.outputs.CustomResourceSubresources;
import com.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.outputs.CustomResourceValidation;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CustomResourceDefinitionVersion {
    /**
     * additionalPrinterColumns specifies additional columns returned in Table output. See https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables for details. Top-level and per-version columns are mutually exclusive. Per-version columns must not all be set to identical values (top-level columns should be used instead). If no top-level or per-version columns are specified, a single column displaying the age of the custom resource is used.
     * 
     */
    private final @Nullable List<CustomResourceColumnDefinition> additionalPrinterColumns;
    /**
     * deprecated indicates this version of the custom resource API is deprecated. When set to true, API requests to this version receive a warning header in the server response. Defaults to false.
     * 
     */
    private final @Nullable Boolean deprecated;
    /**
     * deprecationWarning overrides the default warning returned to API clients. May only be set when `deprecated` is true. The default warning indicates this version is deprecated and recommends use of the newest served version of equal or greater stability, if one exists.
     * 
     */
    private final @Nullable String deprecationWarning;
    /**
     * name is the version name, e.g. “v1”, “v2beta1”, etc. The custom resources are served under this version at `/apis/&lt;group&gt;/&lt;version&gt;/...` if `served` is true.
     * 
     */
    private final String name;
    /**
     * schema describes the schema used for validation and pruning of this version of the custom resource. Top-level and per-version schemas are mutually exclusive. Per-version schemas must not all be set to identical values (top-level validation schema should be used instead).
     * 
     */
    private final @Nullable CustomResourceValidation schema;
    /**
     * served is a flag enabling/disabling this version from being served via REST APIs
     * 
     */
    private final Boolean served;
    /**
     * storage indicates this version should be used when persisting custom resources to storage. There must be exactly one version with storage=true.
     * 
     */
    private final Boolean storage;
    /**
     * subresources specify what subresources this version of the defined custom resource have. Top-level and per-version subresources are mutually exclusive. Per-version subresources must not all be set to identical values (top-level subresources should be used instead).
     * 
     */
    private final @Nullable CustomResourceSubresources subresources;

    @CustomType.Constructor
    private CustomResourceDefinitionVersion(
        @CustomType.Parameter("additionalPrinterColumns") @Nullable List<CustomResourceColumnDefinition> additionalPrinterColumns,
        @CustomType.Parameter("deprecated") @Nullable Boolean deprecated,
        @CustomType.Parameter("deprecationWarning") @Nullable String deprecationWarning,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("schema") @Nullable CustomResourceValidation schema,
        @CustomType.Parameter("served") Boolean served,
        @CustomType.Parameter("storage") Boolean storage,
        @CustomType.Parameter("subresources") @Nullable CustomResourceSubresources subresources) {
        this.additionalPrinterColumns = additionalPrinterColumns;
        this.deprecated = deprecated;
        this.deprecationWarning = deprecationWarning;
        this.name = name;
        this.schema = schema;
        this.served = served;
        this.storage = storage;
        this.subresources = subresources;
    }

    /**
     * additionalPrinterColumns specifies additional columns returned in Table output. See https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables for details. Top-level and per-version columns are mutually exclusive. Per-version columns must not all be set to identical values (top-level columns should be used instead). If no top-level or per-version columns are specified, a single column displaying the age of the custom resource is used.
     * 
    */
    public List<CustomResourceColumnDefinition> additionalPrinterColumns() {
        return this.additionalPrinterColumns == null ? List.of() : this.additionalPrinterColumns;
    }
    /**
     * deprecated indicates this version of the custom resource API is deprecated. When set to true, API requests to this version receive a warning header in the server response. Defaults to false.
     * 
    */
    public Optional<Boolean> deprecated() {
        return Optional.ofNullable(this.deprecated);
    }
    /**
     * deprecationWarning overrides the default warning returned to API clients. May only be set when `deprecated` is true. The default warning indicates this version is deprecated and recommends use of the newest served version of equal or greater stability, if one exists.
     * 
    */
    public Optional<String> deprecationWarning() {
        return Optional.ofNullable(this.deprecationWarning);
    }
    /**
     * name is the version name, e.g. “v1”, “v2beta1”, etc. The custom resources are served under this version at `/apis/&lt;group&gt;/&lt;version&gt;/...` if `served` is true.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * schema describes the schema used for validation and pruning of this version of the custom resource. Top-level and per-version schemas are mutually exclusive. Per-version schemas must not all be set to identical values (top-level validation schema should be used instead).
     * 
    */
    public Optional<CustomResourceValidation> schema() {
        return Optional.ofNullable(this.schema);
    }
    /**
     * served is a flag enabling/disabling this version from being served via REST APIs
     * 
    */
    public Boolean served() {
        return this.served;
    }
    /**
     * storage indicates this version should be used when persisting custom resources to storage. There must be exactly one version with storage=true.
     * 
    */
    public Boolean storage() {
        return this.storage;
    }
    /**
     * subresources specify what subresources this version of the defined custom resource have. Top-level and per-version subresources are mutually exclusive. Per-version subresources must not all be set to identical values (top-level subresources should be used instead).
     * 
    */
    public Optional<CustomResourceSubresources> subresources() {
        return Optional.ofNullable(this.subresources);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceDefinitionVersion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<CustomResourceColumnDefinition> additionalPrinterColumns;
        private @Nullable Boolean deprecated;
        private @Nullable String deprecationWarning;
        private String name;
        private @Nullable CustomResourceValidation schema;
        private Boolean served;
        private Boolean storage;
        private @Nullable CustomResourceSubresources subresources;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomResourceDefinitionVersion defaults) {
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

        public Builder additionalPrinterColumns(@Nullable List<CustomResourceColumnDefinition> additionalPrinterColumns) {
            this.additionalPrinterColumns = additionalPrinterColumns;
            return this;
        }
        public Builder additionalPrinterColumns(CustomResourceColumnDefinition... additionalPrinterColumns) {
            return additionalPrinterColumns(List.of(additionalPrinterColumns));
        }
        public Builder deprecated(@Nullable Boolean deprecated) {
            this.deprecated = deprecated;
            return this;
        }
        public Builder deprecationWarning(@Nullable String deprecationWarning) {
            this.deprecationWarning = deprecationWarning;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder schema(@Nullable CustomResourceValidation schema) {
            this.schema = schema;
            return this;
        }
        public Builder served(Boolean served) {
            this.served = Objects.requireNonNull(served);
            return this;
        }
        public Builder storage(Boolean storage) {
            this.storage = Objects.requireNonNull(storage);
            return this;
        }
        public Builder subresources(@Nullable CustomResourceSubresources subresources) {
            this.subresources = subresources;
            return this;
        }        public CustomResourceDefinitionVersion build() {
            return new CustomResourceDefinitionVersion(additionalPrinterColumns, deprecated, deprecationWarning, name, schema, served, storage, subresources);
        }
    }
}
