// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azureactivedirectory.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CreateTenantRequestBodyPropertiesArgs extends ResourceArgs {

    public static final CreateTenantRequestBodyPropertiesArgs Empty = new CreateTenantRequestBodyPropertiesArgs();

    /**
     * Country code of Azure tenant (e.g. &#39;US&#39;). Refer to [aka.ms/B2CDataResidency](https://aka.ms/B2CDataResidency) to see valid country codes and corresponding data residency locations. If you do not see a country code in an valid data residency location, choose one from the list.
     * 
     */
    @Import(name="countryCode")
    private @Nullable Output<String> countryCode;

    /**
     * @return Country code of Azure tenant (e.g. &#39;US&#39;). Refer to [aka.ms/B2CDataResidency](https://aka.ms/B2CDataResidency) to see valid country codes and corresponding data residency locations. If you do not see a country code in an valid data residency location, choose one from the list.
     * 
     */
    public Optional<Output<String>> countryCode() {
        return Optional.ofNullable(this.countryCode);
    }

    /**
     * The display name of the B2C tenant.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The display name of the B2C tenant.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    private CreateTenantRequestBodyPropertiesArgs() {}

    private CreateTenantRequestBodyPropertiesArgs(CreateTenantRequestBodyPropertiesArgs $) {
        this.countryCode = $.countryCode;
        this.displayName = $.displayName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CreateTenantRequestBodyPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CreateTenantRequestBodyPropertiesArgs $;

        public Builder() {
            $ = new CreateTenantRequestBodyPropertiesArgs();
        }

        public Builder(CreateTenantRequestBodyPropertiesArgs defaults) {
            $ = new CreateTenantRequestBodyPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param countryCode Country code of Azure tenant (e.g. &#39;US&#39;). Refer to [aka.ms/B2CDataResidency](https://aka.ms/B2CDataResidency) to see valid country codes and corresponding data residency locations. If you do not see a country code in an valid data residency location, choose one from the list.
         * 
         * @return builder
         * 
         */
        public Builder countryCode(@Nullable Output<String> countryCode) {
            $.countryCode = countryCode;
            return this;
        }

        /**
         * @param countryCode Country code of Azure tenant (e.g. &#39;US&#39;). Refer to [aka.ms/B2CDataResidency](https://aka.ms/B2CDataResidency) to see valid country codes and corresponding data residency locations. If you do not see a country code in an valid data residency location, choose one from the list.
         * 
         * @return builder
         * 
         */
        public Builder countryCode(String countryCode) {
            return countryCode(Output.of(countryCode));
        }

        /**
         * @param displayName The display name of the B2C tenant.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The display name of the B2C tenant.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public CreateTenantRequestBodyPropertiesArgs build() {
            return $;
        }
    }

}
