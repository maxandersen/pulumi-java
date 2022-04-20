// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.certificateauthority.inputs.CertificateTemplateIdentityConstraintsArgs;
import com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePassthroughExtensionsArgs;
import com.pulumi.gcp.certificateauthority.inputs.CertificateTemplatePredefinedValuesArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateTemplateArgs Empty = new CertificateTemplateArgs();

    /**
     * Optional. Description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Optional. Describes constraints on identities that may be appear in Certificates issued using this template. If this is omitted, then this template will not add restrictions on a certificate&#39;s identity.
     * 
     */
    @Import(name="identityConstraints")
      private final @Nullable Output<CertificateTemplateIdentityConstraintsArgs> identityConstraints;

    public Output<CertificateTemplateIdentityConstraintsArgs> identityConstraints() {
        return this.identityConstraints == null ? Codegen.empty() : this.identityConstraints;
    }

    /**
     * Optional. Labels with user-defined metadata.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * Optional. String indicating the location of the expression for error reporting, e.g. a file name and a position in the file.
     * 
     */
    @Import(name="location", required=true)
      private final Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    /**
     * The resource name for this CertificateTemplate in the format `projects/*{@literal /}locations/*{@literal /}certificateTemplates/*`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Optional. Describes the set of X.509 extensions that may appear in a Certificate issued using this CertificateTemplate. If a certificate request sets extensions that don&#39;t appear in the passthrough_extensions, those extensions will be dropped. If the issuing CaPool&#39;s IssuancePolicy defines baseline_values that don&#39;t appear here, the certificate issuance request will fail. If this is omitted, then this template will not add restrictions on a certificate&#39;s X.509 extensions. These constraints do not apply to X.509 extensions set in this CertificateTemplate&#39;s predefined_values.
     * 
     */
    @Import(name="passthroughExtensions")
      private final @Nullable Output<CertificateTemplatePassthroughExtensionsArgs> passthroughExtensions;

    public Output<CertificateTemplatePassthroughExtensionsArgs> passthroughExtensions() {
        return this.passthroughExtensions == null ? Codegen.empty() : this.passthroughExtensions;
    }

    /**
     * Optional. A set of X.509 values that will be applied to all issued certificates that use this template. If the certificate request includes conflicting values for the same properties, they will be overwritten by the values defined here. If the issuing CaPool&#39;s IssuancePolicy defines conflicting baseline_values for the same properties, the certificate issuance request will fail.
     * 
     */
    @Import(name="predefinedValues")
      private final @Nullable Output<CertificateTemplatePredefinedValuesArgs> predefinedValues;

    public Output<CertificateTemplatePredefinedValuesArgs> predefinedValues() {
        return this.predefinedValues == null ? Codegen.empty() : this.predefinedValues;
    }

    /**
     * The project for the resource
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    public CertificateTemplateArgs(
        @Nullable Output<String> description,
        @Nullable Output<CertificateTemplateIdentityConstraintsArgs> identityConstraints,
        @Nullable Output<Map<String,String>> labels,
        Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<CertificateTemplatePassthroughExtensionsArgs> passthroughExtensions,
        @Nullable Output<CertificateTemplatePredefinedValuesArgs> predefinedValues,
        @Nullable Output<String> project) {
        this.description = description;
        this.identityConstraints = identityConstraints;
        this.labels = labels;
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.name = name;
        this.passthroughExtensions = passthroughExtensions;
        this.predefinedValues = predefinedValues;
        this.project = project;
    }

    private CertificateTemplateArgs() {
        this.description = Codegen.empty();
        this.identityConstraints = Codegen.empty();
        this.labels = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.passthroughExtensions = Codegen.empty();
        this.predefinedValues = Codegen.empty();
        this.project = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<CertificateTemplateIdentityConstraintsArgs> identityConstraints;
        private @Nullable Output<Map<String,String>> labels;
        private Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<CertificateTemplatePassthroughExtensionsArgs> passthroughExtensions;
        private @Nullable Output<CertificateTemplatePredefinedValuesArgs> predefinedValues;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.identityConstraints = defaults.identityConstraints;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.passthroughExtensions = defaults.passthroughExtensions;
    	      this.predefinedValues = defaults.predefinedValues;
    	      this.project = defaults.project;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder identityConstraints(@Nullable Output<CertificateTemplateIdentityConstraintsArgs> identityConstraints) {
            this.identityConstraints = identityConstraints;
            return this;
        }
        public Builder identityConstraints(@Nullable CertificateTemplateIdentityConstraintsArgs identityConstraints) {
            this.identityConstraints = Codegen.ofNullable(identityConstraints);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder location(Output<String> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder location(String location) {
            this.location = Output.of(Objects.requireNonNull(location));
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
        public Builder passthroughExtensions(@Nullable Output<CertificateTemplatePassthroughExtensionsArgs> passthroughExtensions) {
            this.passthroughExtensions = passthroughExtensions;
            return this;
        }
        public Builder passthroughExtensions(@Nullable CertificateTemplatePassthroughExtensionsArgs passthroughExtensions) {
            this.passthroughExtensions = Codegen.ofNullable(passthroughExtensions);
            return this;
        }
        public Builder predefinedValues(@Nullable Output<CertificateTemplatePredefinedValuesArgs> predefinedValues) {
            this.predefinedValues = predefinedValues;
            return this;
        }
        public Builder predefinedValues(@Nullable CertificateTemplatePredefinedValuesArgs predefinedValues) {
            this.predefinedValues = Codegen.ofNullable(predefinedValues);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }        public CertificateTemplateArgs build() {
            return new CertificateTemplateArgs(description, identityConstraints, labels, location, name, passthroughExtensions, predefinedValues, project);
        }
    }
}
