// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.accesscontextmanager.outputs.AccessLevelsAccessLevelBasic;
import com.pulumi.gcp.accesscontextmanager.outputs.AccessLevelsAccessLevelCustom;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AccessLevelsAccessLevel {
    /**
     * @return A set of predefined conditions for the access level and a combining function.
     * Structure is documented below.
     * 
     */
    private final @Nullable AccessLevelsAccessLevelBasic basic;
    /**
     * @return Custom access level conditions are set using the Cloud Common Expression Language to represent the necessary conditions for the level to apply to a request.
     * See CEL spec at: https://github.com/google/cel-spec.
     * Structure is documented below.
     * 
     */
    private final @Nullable AccessLevelsAccessLevelCustom custom;
    /**
     * @return Description of the expression
     * 
     */
    private final @Nullable String description;
    /**
     * @return Resource name for the Access Level. The short_name component must begin
     * with a letter and only include alphanumeric and &#39;_&#39;.
     * Format: accessPolicies/{policy_id}/accessLevels/{short_name}
     * 
     */
    private final String name;
    /**
     * @return Title for the expression, i.e. a short string describing its purpose.
     * 
     */
    private final String title;

    @CustomType.Constructor
    private AccessLevelsAccessLevel(
        @CustomType.Parameter("basic") @Nullable AccessLevelsAccessLevelBasic basic,
        @CustomType.Parameter("custom") @Nullable AccessLevelsAccessLevelCustom custom,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("title") String title) {
        this.basic = basic;
        this.custom = custom;
        this.description = description;
        this.name = name;
        this.title = title;
    }

    /**
     * @return A set of predefined conditions for the access level and a combining function.
     * Structure is documented below.
     * 
     */
    public Optional<AccessLevelsAccessLevelBasic> basic() {
        return Optional.ofNullable(this.basic);
    }
    /**
     * @return Custom access level conditions are set using the Cloud Common Expression Language to represent the necessary conditions for the level to apply to a request.
     * See CEL spec at: https://github.com/google/cel-spec.
     * Structure is documented below.
     * 
     */
    public Optional<AccessLevelsAccessLevelCustom> custom() {
        return Optional.ofNullable(this.custom);
    }
    /**
     * @return Description of the expression
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Resource name for the Access Level. The short_name component must begin
     * with a letter and only include alphanumeric and &#39;_&#39;.
     * Format: accessPolicies/{policy_id}/accessLevels/{short_name}
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Title for the expression, i.e. a short string describing its purpose.
     * 
     */
    public String title() {
        return this.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessLevelsAccessLevel defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AccessLevelsAccessLevelBasic basic;
        private @Nullable AccessLevelsAccessLevelCustom custom;
        private @Nullable String description;
        private String name;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessLevelsAccessLevel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basic = defaults.basic;
    	      this.custom = defaults.custom;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.title = defaults.title;
        }

        public Builder basic(@Nullable AccessLevelsAccessLevelBasic basic) {
            this.basic = basic;
            return this;
        }
        public Builder custom(@Nullable AccessLevelsAccessLevelCustom custom) {
            this.custom = custom;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }        public AccessLevelsAccessLevel build() {
            return new AccessLevelsAccessLevel(basic, custom, description, name, title);
        }
    }
}
