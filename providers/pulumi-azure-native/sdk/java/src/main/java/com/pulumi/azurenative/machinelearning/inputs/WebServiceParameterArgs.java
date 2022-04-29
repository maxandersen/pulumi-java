// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearning.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Web Service Parameter object for node and global parameter
 * 
 */
public final class WebServiceParameterArgs extends ResourceArgs {

    public static final WebServiceParameterArgs Empty = new WebServiceParameterArgs();

    /**
     * If the parameter value in &#39;value&#39; field is encrypted, the thumbprint of the certificate should be put here.
     * 
     */
    @Import(name="certificateThumbprint")
    private @Nullable Output<String> certificateThumbprint;

    /**
     * @return If the parameter value in &#39;value&#39; field is encrypted, the thumbprint of the certificate should be put here.
     * 
     */
    public Optional<Output<String>> certificateThumbprint() {
        return Optional.ofNullable(this.certificateThumbprint);
    }

    /**
     * The parameter value
     * 
     */
    @Import(name="value")
    private @Nullable Output<Object> value;

    /**
     * @return The parameter value
     * 
     */
    public Optional<Output<Object>> value() {
        return Optional.ofNullable(this.value);
    }

    private WebServiceParameterArgs() {}

    private WebServiceParameterArgs(WebServiceParameterArgs $) {
        this.certificateThumbprint = $.certificateThumbprint;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebServiceParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebServiceParameterArgs $;

        public Builder() {
            $ = new WebServiceParameterArgs();
        }

        public Builder(WebServiceParameterArgs defaults) {
            $ = new WebServiceParameterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateThumbprint If the parameter value in &#39;value&#39; field is encrypted, the thumbprint of the certificate should be put here.
         * 
         * @return builder
         * 
         */
        public Builder certificateThumbprint(@Nullable Output<String> certificateThumbprint) {
            $.certificateThumbprint = certificateThumbprint;
            return this;
        }

        /**
         * @param certificateThumbprint If the parameter value in &#39;value&#39; field is encrypted, the thumbprint of the certificate should be put here.
         * 
         * @return builder
         * 
         */
        public Builder certificateThumbprint(String certificateThumbprint) {
            return certificateThumbprint(Output.of(certificateThumbprint));
        }

        /**
         * @param value The parameter value
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<Object> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The parameter value
         * 
         * @return builder
         * 
         */
        public Builder value(Object value) {
            return value(Output.of(value));
        }

        public WebServiceParameterArgs build() {
            return $;
        }
    }

}
