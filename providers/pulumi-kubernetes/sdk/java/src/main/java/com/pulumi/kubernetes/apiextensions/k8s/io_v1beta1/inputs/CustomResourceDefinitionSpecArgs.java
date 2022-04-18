// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.inputs.CustomResourceColumnDefinitionArgs;
import com.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.inputs.CustomResourceConversionArgs;
import com.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.inputs.CustomResourceDefinitionNamesArgs;
import com.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.inputs.CustomResourceDefinitionVersionArgs;
import com.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.inputs.CustomResourceSubresourcesArgs;
import com.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.inputs.CustomResourceValidationArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * CustomResourceDefinitionSpec describes how a user wants their resource to appear
 * 
 */
public final class CustomResourceDefinitionSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomResourceDefinitionSpecArgs Empty = new CustomResourceDefinitionSpecArgs();

    /**
     * additionalPrinterColumns specifies additional columns returned in Table output. See https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables for details. If present, this field configures columns for all versions. Top-level and per-version columns are mutually exclusive. If no top-level or per-version columns are specified, a single column displaying the age of the custom resource is used.
     * 
     */
    @Import(name="additionalPrinterColumns")
      private final @Nullable Output<List<CustomResourceColumnDefinitionArgs>> additionalPrinterColumns;

    public Output<List<CustomResourceColumnDefinitionArgs>> additionalPrinterColumns() {
        return this.additionalPrinterColumns == null ? Codegen.empty() : this.additionalPrinterColumns;
    }

    /**
     * conversion defines conversion settings for the CRD.
     * 
     */
    @Import(name="conversion")
      private final @Nullable Output<CustomResourceConversionArgs> conversion;

    public Output<CustomResourceConversionArgs> conversion() {
        return this.conversion == null ? Codegen.empty() : this.conversion;
    }

    /**
     * group is the API group of the defined custom resource. The custom resources are served under `/apis/<group>/...`. Must match the name of the CustomResourceDefinition (in the form `<names.plural>.<group>`).
     * 
     */
    @Import(name="group", required=true)
      private final Output<String> group;

    public Output<String> group() {
        return this.group;
    }

    /**
     * names specify the resource and kind names for the custom resource.
     * 
     */
    @Import(name="names", required=true)
      private final Output<CustomResourceDefinitionNamesArgs> names;

    public Output<CustomResourceDefinitionNamesArgs> names() {
        return this.names;
    }

    /**
     * preserveUnknownFields indicates that object fields which are not specified in the OpenAPI schema should be preserved when persisting to storage. apiVersion, kind, metadata and known fields inside metadata are always preserved. If false, schemas must be defined for all versions. Defaults to true in v1beta for backwards compatibility. Deprecated: will be required to be false in v1. Preservation of unknown fields can be specified in the validation schema using the `x-kubernetes-preserve-unknown-fields: true` extension. See https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions/#pruning-versus-preserving-unknown-fields for details.
     * 
     */
    @Import(name="preserveUnknownFields")
      private final @Nullable Output<Boolean> preserveUnknownFields;

    public Output<Boolean> preserveUnknownFields() {
        return this.preserveUnknownFields == null ? Codegen.empty() : this.preserveUnknownFields;
    }

    /**
     * scope indicates whether the defined custom resource is cluster- or namespace-scoped. Allowed values are `Cluster` and `Namespaced`. Default is `Namespaced`.
     * 
     */
    @Import(name="scope", required=true)
      private final Output<String> scope;

    public Output<String> scope() {
        return this.scope;
    }

    /**
     * subresources specify what subresources the defined custom resource has. If present, this field configures subresources for all versions. Top-level and per-version subresources are mutually exclusive.
     * 
     */
    @Import(name="subresources")
      private final @Nullable Output<CustomResourceSubresourcesArgs> subresources;

    public Output<CustomResourceSubresourcesArgs> subresources() {
        return this.subresources == null ? Codegen.empty() : this.subresources;
    }

    /**
     * validation describes the schema used for validation and pruning of the custom resource. If present, this validation schema is used to validate all versions. Top-level and per-version schemas are mutually exclusive.
     * 
     */
    @Import(name="validation")
      private final @Nullable Output<CustomResourceValidationArgs> validation;

    public Output<CustomResourceValidationArgs> validation() {
        return this.validation == null ? Codegen.empty() : this.validation;
    }

    /**
     * version is the API version of the defined custom resource. The custom resources are served under `/apis/<group>/<version>/...`. Must match the name of the first item in the `versions` list if `version` and `versions` are both specified. Optional if `versions` is specified. Deprecated: use `versions` instead.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> version() {
        return this.version == null ? Codegen.empty() : this.version;
    }

    /**
     * versions is the list of all API versions of the defined custom resource. Optional if `version` is specified. The name of the first item in the `versions` list must match the `version` field if `version` and `versions` are both specified. Version names are used to compute the order in which served versions are listed in API discovery. If the version string is "kube-like", it will sort above non "kube-like" version strings, which are ordered lexicographically. "Kube-like" versions start with a "v", then are followed by a number (the major version), then optionally the string "alpha" or "beta" and another number (the minor version). These are sorted first by GA > beta > alpha (where GA is a version with no suffix such as beta or alpha), and then by comparing major version, then minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1, v11alpha2, foo1, foo10.
     * 
     */
    @Import(name="versions")
      private final @Nullable Output<List<CustomResourceDefinitionVersionArgs>> versions;

    public Output<List<CustomResourceDefinitionVersionArgs>> versions() {
        return this.versions == null ? Codegen.empty() : this.versions;
    }

    public CustomResourceDefinitionSpecArgs(
        @Nullable Output<List<CustomResourceColumnDefinitionArgs>> additionalPrinterColumns,
        @Nullable Output<CustomResourceConversionArgs> conversion,
        Output<String> group,
        Output<CustomResourceDefinitionNamesArgs> names,
        @Nullable Output<Boolean> preserveUnknownFields,
        Output<String> scope,
        @Nullable Output<CustomResourceSubresourcesArgs> subresources,
        @Nullable Output<CustomResourceValidationArgs> validation,
        @Nullable Output<String> version,
        @Nullable Output<List<CustomResourceDefinitionVersionArgs>> versions) {
        this.additionalPrinterColumns = additionalPrinterColumns;
        this.conversion = conversion;
        this.group = Objects.requireNonNull(group, "expected parameter 'group' to be non-null");
        this.names = Objects.requireNonNull(names, "expected parameter 'names' to be non-null");
        this.preserveUnknownFields = preserveUnknownFields;
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
        this.subresources = subresources;
        this.validation = validation;
        this.version = version;
        this.versions = versions;
    }

    private CustomResourceDefinitionSpecArgs() {
        this.additionalPrinterColumns = Codegen.empty();
        this.conversion = Codegen.empty();
        this.group = Codegen.empty();
        this.names = Codegen.empty();
        this.preserveUnknownFields = Codegen.empty();
        this.scope = Codegen.empty();
        this.subresources = Codegen.empty();
        this.validation = Codegen.empty();
        this.version = Codegen.empty();
        this.versions = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceDefinitionSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<CustomResourceColumnDefinitionArgs>> additionalPrinterColumns;
        private @Nullable Output<CustomResourceConversionArgs> conversion;
        private Output<String> group;
        private Output<CustomResourceDefinitionNamesArgs> names;
        private @Nullable Output<Boolean> preserveUnknownFields;
        private Output<String> scope;
        private @Nullable Output<CustomResourceSubresourcesArgs> subresources;
        private @Nullable Output<CustomResourceValidationArgs> validation;
        private @Nullable Output<String> version;
        private @Nullable Output<List<CustomResourceDefinitionVersionArgs>> versions;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomResourceDefinitionSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalPrinterColumns = defaults.additionalPrinterColumns;
    	      this.conversion = defaults.conversion;
    	      this.group = defaults.group;
    	      this.names = defaults.names;
    	      this.preserveUnknownFields = defaults.preserveUnknownFields;
    	      this.scope = defaults.scope;
    	      this.subresources = defaults.subresources;
    	      this.validation = defaults.validation;
    	      this.version = defaults.version;
    	      this.versions = defaults.versions;
        }

        public Builder additionalPrinterColumns(@Nullable Output<List<CustomResourceColumnDefinitionArgs>> additionalPrinterColumns) {
            this.additionalPrinterColumns = additionalPrinterColumns;
            return this;
        }
        public Builder additionalPrinterColumns(@Nullable List<CustomResourceColumnDefinitionArgs> additionalPrinterColumns) {
            this.additionalPrinterColumns = Codegen.ofNullable(additionalPrinterColumns);
            return this;
        }
        public Builder additionalPrinterColumns(CustomResourceColumnDefinitionArgs... additionalPrinterColumns) {
            return additionalPrinterColumns(List.of(additionalPrinterColumns));
        }
        public Builder conversion(@Nullable Output<CustomResourceConversionArgs> conversion) {
            this.conversion = conversion;
            return this;
        }
        public Builder conversion(@Nullable CustomResourceConversionArgs conversion) {
            this.conversion = Codegen.ofNullable(conversion);
            return this;
        }
        public Builder group(Output<String> group) {
            this.group = Objects.requireNonNull(group);
            return this;
        }
        public Builder group(String group) {
            this.group = Output.of(Objects.requireNonNull(group));
            return this;
        }
        public Builder names(Output<CustomResourceDefinitionNamesArgs> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(CustomResourceDefinitionNamesArgs names) {
            this.names = Output.of(Objects.requireNonNull(names));
            return this;
        }
        public Builder preserveUnknownFields(@Nullable Output<Boolean> preserveUnknownFields) {
            this.preserveUnknownFields = preserveUnknownFields;
            return this;
        }
        public Builder preserveUnknownFields(@Nullable Boolean preserveUnknownFields) {
            this.preserveUnknownFields = Codegen.ofNullable(preserveUnknownFields);
            return this;
        }
        public Builder scope(Output<String> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public Builder scope(String scope) {
            this.scope = Output.of(Objects.requireNonNull(scope));
            return this;
        }
        public Builder subresources(@Nullable Output<CustomResourceSubresourcesArgs> subresources) {
            this.subresources = subresources;
            return this;
        }
        public Builder subresources(@Nullable CustomResourceSubresourcesArgs subresources) {
            this.subresources = Codegen.ofNullable(subresources);
            return this;
        }
        public Builder validation(@Nullable Output<CustomResourceValidationArgs> validation) {
            this.validation = validation;
            return this;
        }
        public Builder validation(@Nullable CustomResourceValidationArgs validation) {
            this.validation = Codegen.ofNullable(validation);
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
        public Builder versions(@Nullable Output<List<CustomResourceDefinitionVersionArgs>> versions) {
            this.versions = versions;
            return this;
        }
        public Builder versions(@Nullable List<CustomResourceDefinitionVersionArgs> versions) {
            this.versions = Codegen.ofNullable(versions);
            return this;
        }
        public Builder versions(CustomResourceDefinitionVersionArgs... versions) {
            return versions(List.of(versions));
        }        public CustomResourceDefinitionSpecArgs build() {
            return new CustomResourceDefinitionSpecArgs(additionalPrinterColumns, conversion, group, names, preserveUnknownFields, scope, subresources, validation, version, versions);
        }
    }
}
