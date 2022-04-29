// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProfileArgs extends InvokeArgs {

    public static final GetProfileArgs Empty = new GetProfileArgs();

    /**
     * The name of the hub.
     * 
     */
    @Import(name="hubName", required=true)
    private String hubName;

    /**
     * @return The name of the hub.
     * 
     */
    public String hubName() {
        return this.hubName;
    }

    /**
     * Locale of profile to retrieve, default is en-us.
     * 
     */
    @Import(name="localeCode")
    private @Nullable String localeCode;

    /**
     * @return Locale of profile to retrieve, default is en-us.
     * 
     */
    public Optional<String> localeCode() {
        return Optional.ofNullable(this.localeCode);
    }

    /**
     * The name of the profile.
     * 
     */
    @Import(name="profileName", required=true)
    private String profileName;

    /**
     * @return The name of the profile.
     * 
     */
    public String profileName() {
        return this.profileName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetProfileArgs() {}

    private GetProfileArgs(GetProfileArgs $) {
        this.hubName = $.hubName;
        this.localeCode = $.localeCode;
        this.profileName = $.profileName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetProfileArgs $;

        public Builder() {
            $ = new GetProfileArgs();
        }

        public Builder(GetProfileArgs defaults) {
            $ = new GetProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hubName The name of the hub.
         * 
         * @return builder
         * 
         */
        public Builder hubName(String hubName) {
            $.hubName = hubName;
            return this;
        }

        /**
         * @param localeCode Locale of profile to retrieve, default is en-us.
         * 
         * @return builder
         * 
         */
        public Builder localeCode(@Nullable String localeCode) {
            $.localeCode = localeCode;
            return this;
        }

        /**
         * @param profileName The name of the profile.
         * 
         * @return builder
         * 
         */
        public Builder profileName(String profileName) {
            $.profileName = profileName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetProfileArgs build() {
            $.hubName = Objects.requireNonNull($.hubName, "expected parameter 'hubName' to be non-null");
            $.profileName = Objects.requireNonNull($.profileName, "expected parameter 'profileName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
