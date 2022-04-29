// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Valid enum values in case of an enum property.
 * 
 */
public final class ProfileEnumValidValuesFormatArgs extends ResourceArgs {

    public static final ProfileEnumValidValuesFormatArgs Empty = new ProfileEnumValidValuesFormatArgs();

    /**
     * Localized names of the enum member.
     * 
     */
    @Import(name="localizedValueNames")
    private @Nullable Output<Map<String,String>> localizedValueNames;

    /**
     * @return Localized names of the enum member.
     * 
     */
    public Optional<Output<Map<String,String>>> localizedValueNames() {
        return Optional.ofNullable(this.localizedValueNames);
    }

    /**
     * The integer value of the enum member.
     * 
     */
    @Import(name="value")
    private @Nullable Output<Integer> value;

    /**
     * @return The integer value of the enum member.
     * 
     */
    public Optional<Output<Integer>> value() {
        return Optional.ofNullable(this.value);
    }

    private ProfileEnumValidValuesFormatArgs() {}

    private ProfileEnumValidValuesFormatArgs(ProfileEnumValidValuesFormatArgs $) {
        this.localizedValueNames = $.localizedValueNames;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProfileEnumValidValuesFormatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProfileEnumValidValuesFormatArgs $;

        public Builder() {
            $ = new ProfileEnumValidValuesFormatArgs();
        }

        public Builder(ProfileEnumValidValuesFormatArgs defaults) {
            $ = new ProfileEnumValidValuesFormatArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param localizedValueNames Localized names of the enum member.
         * 
         * @return builder
         * 
         */
        public Builder localizedValueNames(@Nullable Output<Map<String,String>> localizedValueNames) {
            $.localizedValueNames = localizedValueNames;
            return this;
        }

        /**
         * @param localizedValueNames Localized names of the enum member.
         * 
         * @return builder
         * 
         */
        public Builder localizedValueNames(Map<String,String> localizedValueNames) {
            return localizedValueNames(Output.of(localizedValueNames));
        }

        /**
         * @param value The integer value of the enum member.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<Integer> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The integer value of the enum member.
         * 
         * @return builder
         * 
         */
        public Builder value(Integer value) {
            return value(Output.of(value));
        }

        public ProfileEnumValidValuesFormatArgs build() {
            return $;
        }
    }

}
