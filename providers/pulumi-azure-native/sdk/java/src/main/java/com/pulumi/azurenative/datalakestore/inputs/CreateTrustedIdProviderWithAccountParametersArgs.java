// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datalakestore.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;


/**
 * The parameters used to create a new trusted identity provider while creating a new Data Lake Store account.
 * 
 */
public final class CreateTrustedIdProviderWithAccountParametersArgs extends ResourceArgs {

    public static final CreateTrustedIdProviderWithAccountParametersArgs Empty = new CreateTrustedIdProviderWithAccountParametersArgs();

    /**
     * The URL of this trusted identity provider.
     * 
     */
    @Import(name="idProvider", required=true)
    private Output<String> idProvider;

    /**
     * @return The URL of this trusted identity provider.
     * 
     */
    public Output<String> idProvider() {
        return this.idProvider;
    }

    /**
     * The unique name of the trusted identity provider to create.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The unique name of the trusted identity provider to create.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private CreateTrustedIdProviderWithAccountParametersArgs() {}

    private CreateTrustedIdProviderWithAccountParametersArgs(CreateTrustedIdProviderWithAccountParametersArgs $) {
        this.idProvider = $.idProvider;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CreateTrustedIdProviderWithAccountParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CreateTrustedIdProviderWithAccountParametersArgs $;

        public Builder() {
            $ = new CreateTrustedIdProviderWithAccountParametersArgs();
        }

        public Builder(CreateTrustedIdProviderWithAccountParametersArgs defaults) {
            $ = new CreateTrustedIdProviderWithAccountParametersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param idProvider The URL of this trusted identity provider.
         * 
         * @return builder
         * 
         */
        public Builder idProvider(Output<String> idProvider) {
            $.idProvider = idProvider;
            return this;
        }

        /**
         * @param idProvider The URL of this trusted identity provider.
         * 
         * @return builder
         * 
         */
        public Builder idProvider(String idProvider) {
            return idProvider(Output.of(idProvider));
        }

        /**
         * @param name The unique name of the trusted identity provider to create.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The unique name of the trusted identity provider to create.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public CreateTrustedIdProviderWithAccountParametersArgs build() {
            $.idProvider = Objects.requireNonNull($.idProvider, "expected parameter 'idProvider' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
