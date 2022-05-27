// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.automation;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateArgs Empty = new CertificateArgs();

    /**
     * The name of the automation account in which the Certificate is created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="automationAccountName", required=true)
    private Output<String> automationAccountName;

    /**
     * @return The name of the automation account in which the Certificate is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> automationAccountName() {
        return this.automationAccountName;
    }

    /**
     * Base64 encoded value of the certificate. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="base64", required=true)
    private Output<String> base64;

    /**
     * @return Base64 encoded value of the certificate. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> base64() {
        return this.base64;
    }

    /**
     * The description of this Automation Certificate.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of this Automation Certificate.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The is exportable flag of the certificate.
     * 
     */
    @Import(name="exportable")
    private @Nullable Output<Boolean> exportable;

    /**
     * @return The is exportable flag of the certificate.
     * 
     */
    public Optional<Output<Boolean>> exportable() {
        return Optional.ofNullable(this.exportable);
    }

    /**
     * Specifies the name of the Certificate. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Certificate. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the resource group in which the Certificate is created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the Certificate is created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private CertificateArgs() {}

    private CertificateArgs(CertificateArgs $) {
        this.automationAccountName = $.automationAccountName;
        this.base64 = $.base64;
        this.description = $.description;
        this.exportable = $.exportable;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateArgs $;

        public Builder() {
            $ = new CertificateArgs();
        }

        public Builder(CertificateArgs defaults) {
            $ = new CertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param automationAccountName The name of the automation account in which the Certificate is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder automationAccountName(Output<String> automationAccountName) {
            $.automationAccountName = automationAccountName;
            return this;
        }

        /**
         * @param automationAccountName The name of the automation account in which the Certificate is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder automationAccountName(String automationAccountName) {
            return automationAccountName(Output.of(automationAccountName));
        }

        /**
         * @param base64 Base64 encoded value of the certificate. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder base64(Output<String> base64) {
            $.base64 = base64;
            return this;
        }

        /**
         * @param base64 Base64 encoded value of the certificate. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder base64(String base64) {
            return base64(Output.of(base64));
        }

        /**
         * @param description The description of this Automation Certificate.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of this Automation Certificate.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param exportable The is exportable flag of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder exportable(@Nullable Output<Boolean> exportable) {
            $.exportable = exportable;
            return this;
        }

        /**
         * @param exportable The is exportable flag of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder exportable(Boolean exportable) {
            return exportable(Output.of(exportable));
        }

        /**
         * @param name Specifies the name of the Certificate. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Certificate. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The name of the resource group in which the Certificate is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which the Certificate is created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public CertificateArgs build() {
            $.automationAccountName = Objects.requireNonNull($.automationAccountName, "expected parameter 'automationAccountName' to be non-null");
            $.base64 = Objects.requireNonNull($.base64, "expected parameter 'base64' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
