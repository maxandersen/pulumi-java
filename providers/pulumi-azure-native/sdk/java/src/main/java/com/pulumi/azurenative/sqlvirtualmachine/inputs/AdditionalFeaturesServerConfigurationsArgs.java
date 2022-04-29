// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sqlvirtualmachine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Additional SQL Server feature settings.
 * 
 */
public final class AdditionalFeaturesServerConfigurationsArgs extends ResourceArgs {

    public static final AdditionalFeaturesServerConfigurationsArgs Empty = new AdditionalFeaturesServerConfigurationsArgs();

    /**
     * Enable or disable R services (SQL 2016 onwards).
     * 
     */
    @Import(name="isRServicesEnabled")
    private @Nullable Output<Boolean> isRServicesEnabled;

    /**
     * @return Enable or disable R services (SQL 2016 onwards).
     * 
     */
    public Optional<Output<Boolean>> isRServicesEnabled() {
        return Optional.ofNullable(this.isRServicesEnabled);
    }

    private AdditionalFeaturesServerConfigurationsArgs() {}

    private AdditionalFeaturesServerConfigurationsArgs(AdditionalFeaturesServerConfigurationsArgs $) {
        this.isRServicesEnabled = $.isRServicesEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AdditionalFeaturesServerConfigurationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AdditionalFeaturesServerConfigurationsArgs $;

        public Builder() {
            $ = new AdditionalFeaturesServerConfigurationsArgs();
        }

        public Builder(AdditionalFeaturesServerConfigurationsArgs defaults) {
            $ = new AdditionalFeaturesServerConfigurationsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param isRServicesEnabled Enable or disable R services (SQL 2016 onwards).
         * 
         * @return builder
         * 
         */
        public Builder isRServicesEnabled(@Nullable Output<Boolean> isRServicesEnabled) {
            $.isRServicesEnabled = isRServicesEnabled;
            return this;
        }

        /**
         * @param isRServicesEnabled Enable or disable R services (SQL 2016 onwards).
         * 
         * @return builder
         * 
         */
        public Builder isRServicesEnabled(Boolean isRServicesEnabled) {
            return isRServicesEnabled(Output.of(isRServicesEnabled));
        }

        public AdditionalFeaturesServerConfigurationsArgs build() {
            return $;
        }
    }

}
