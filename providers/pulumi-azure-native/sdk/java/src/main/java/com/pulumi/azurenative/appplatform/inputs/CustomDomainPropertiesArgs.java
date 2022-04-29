// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Custom domain of app resource payload.
 * 
 */
public final class CustomDomainPropertiesArgs extends ResourceArgs {

    public static final CustomDomainPropertiesArgs Empty = new CustomDomainPropertiesArgs();

    /**
     * The bound certificate name of domain.
     * 
     */
    @Import(name="certName")
    private @Nullable Output<String> certName;

    /**
     * @return The bound certificate name of domain.
     * 
     */
    public Optional<Output<String>> certName() {
        return Optional.ofNullable(this.certName);
    }

    /**
     * The thumbprint of bound certificate.
     * 
     */
    @Import(name="thumbprint")
    private @Nullable Output<String> thumbprint;

    /**
     * @return The thumbprint of bound certificate.
     * 
     */
    public Optional<Output<String>> thumbprint() {
        return Optional.ofNullable(this.thumbprint);
    }

    private CustomDomainPropertiesArgs() {}

    private CustomDomainPropertiesArgs(CustomDomainPropertiesArgs $) {
        this.certName = $.certName;
        this.thumbprint = $.thumbprint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomDomainPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomDomainPropertiesArgs $;

        public Builder() {
            $ = new CustomDomainPropertiesArgs();
        }

        public Builder(CustomDomainPropertiesArgs defaults) {
            $ = new CustomDomainPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certName The bound certificate name of domain.
         * 
         * @return builder
         * 
         */
        public Builder certName(@Nullable Output<String> certName) {
            $.certName = certName;
            return this;
        }

        /**
         * @param certName The bound certificate name of domain.
         * 
         * @return builder
         * 
         */
        public Builder certName(String certName) {
            return certName(Output.of(certName));
        }

        /**
         * @param thumbprint The thumbprint of bound certificate.
         * 
         * @return builder
         * 
         */
        public Builder thumbprint(@Nullable Output<String> thumbprint) {
            $.thumbprint = thumbprint;
            return this;
        }

        /**
         * @param thumbprint The thumbprint of bound certificate.
         * 
         * @return builder
         * 
         */
        public Builder thumbprint(String thumbprint) {
            return thumbprint(Output.of(thumbprint));
        }

        public CustomDomainPropertiesArgs build() {
            return $;
        }
    }

}
