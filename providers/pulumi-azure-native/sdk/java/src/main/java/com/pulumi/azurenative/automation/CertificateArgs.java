// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateArgs Empty = new CertificateArgs();

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
     * Gets or sets the base64 encoded value of the certificate.
     * 
     */
    @Import(name="base64Value", required=true)
      private final Output<String> base64Value;

    public Output<String> base64Value() {
        return this.base64Value;
    }

    /**
     * The parameters supplied to the create or update certificate operation.
     * 
     */
    @Import(name="certificateName")
      private final @Nullable Output<String> certificateName;

    public Output<String> certificateName() {
        return this.certificateName == null ? Codegen.empty() : this.certificateName;
    }

    /**
     * Gets or sets the description of the certificate.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Gets or sets the is exportable flag of the certificate.
     * 
     */
    @Import(name="isExportable")
      private final @Nullable Output<Boolean> isExportable;

    public Output<Boolean> isExportable() {
        return this.isExportable == null ? Codegen.empty() : this.isExportable;
    }

    /**
     * Gets or sets the name of the certificate.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
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
     * Gets or sets the thumbprint of the certificate.
     * 
     */
    @Import(name="thumbprint")
      private final @Nullable Output<String> thumbprint;

    public Output<String> thumbprint() {
        return this.thumbprint == null ? Codegen.empty() : this.thumbprint;
    }

    public CertificateArgs(
        Output<String> automationAccountName,
        Output<String> base64Value,
        @Nullable Output<String> certificateName,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> isExportable,
        Output<String> name,
        Output<String> resourceGroupName,
        @Nullable Output<String> thumbprint) {
        this.automationAccountName = Objects.requireNonNull(automationAccountName, "expected parameter 'automationAccountName' to be non-null");
        this.base64Value = Objects.requireNonNull(base64Value, "expected parameter 'base64Value' to be non-null");
        this.certificateName = certificateName;
        this.description = description;
        this.isExportable = isExportable;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.thumbprint = thumbprint;
    }

    private CertificateArgs() {
        this.automationAccountName = Codegen.empty();
        this.base64Value = Codegen.empty();
        this.certificateName = Codegen.empty();
        this.description = Codegen.empty();
        this.isExportable = Codegen.empty();
        this.name = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.thumbprint = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> automationAccountName;
        private Output<String> base64Value;
        private @Nullable Output<String> certificateName;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> isExportable;
        private Output<String> name;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> thumbprint;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automationAccountName = defaults.automationAccountName;
    	      this.base64Value = defaults.base64Value;
    	      this.certificateName = defaults.certificateName;
    	      this.description = defaults.description;
    	      this.isExportable = defaults.isExportable;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.thumbprint = defaults.thumbprint;
        }

        public Builder automationAccountName(Output<String> automationAccountName) {
            this.automationAccountName = Objects.requireNonNull(automationAccountName);
            return this;
        }
        public Builder automationAccountName(String automationAccountName) {
            this.automationAccountName = Output.of(Objects.requireNonNull(automationAccountName));
            return this;
        }
        public Builder base64Value(Output<String> base64Value) {
            this.base64Value = Objects.requireNonNull(base64Value);
            return this;
        }
        public Builder base64Value(String base64Value) {
            this.base64Value = Output.of(Objects.requireNonNull(base64Value));
            return this;
        }
        public Builder certificateName(@Nullable Output<String> certificateName) {
            this.certificateName = certificateName;
            return this;
        }
        public Builder certificateName(@Nullable String certificateName) {
            this.certificateName = Codegen.ofNullable(certificateName);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder isExportable(@Nullable Output<Boolean> isExportable) {
            this.isExportable = isExportable;
            return this;
        }
        public Builder isExportable(@Nullable Boolean isExportable) {
            this.isExportable = Codegen.ofNullable(isExportable);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
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
        public Builder thumbprint(@Nullable Output<String> thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }
        public Builder thumbprint(@Nullable String thumbprint) {
            this.thumbprint = Codegen.ofNullable(thumbprint);
            return this;
        }        public CertificateArgs build() {
            return new CertificateArgs(automationAccountName, base64Value, certificateName, description, isExportable, name, resourceGroupName, thumbprint);
        }
    }
}
