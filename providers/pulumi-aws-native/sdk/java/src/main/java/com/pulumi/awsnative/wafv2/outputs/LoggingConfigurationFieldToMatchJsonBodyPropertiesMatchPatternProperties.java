// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternProperties {
    /**
     * @return Match all of the elements. See also MatchScope in JsonBody. You must specify either this setting or the IncludedPaths setting, but not both.
     * 
     */
    private final @Nullable Object all;
    /**
     * @return Match only the specified include paths. See also MatchScope in JsonBody.
     * 
     */
    private final @Nullable List<String> includedPaths;

    @CustomType.Constructor
    private LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternProperties(
        @CustomType.Parameter("all") @Nullable Object all,
        @CustomType.Parameter("includedPaths") @Nullable List<String> includedPaths) {
        this.all = all;
        this.includedPaths = includedPaths;
    }

    /**
     * @return Match all of the elements. See also MatchScope in JsonBody. You must specify either this setting or the IncludedPaths setting, but not both.
     * 
     */
    public Optional<Object> all() {
        return Optional.ofNullable(this.all);
    }
    /**
     * @return Match only the specified include paths. See also MatchScope in JsonBody.
     * 
     */
    public List<String> includedPaths() {
        return this.includedPaths == null ? List.of() : this.includedPaths;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object all;
        private @Nullable List<String> includedPaths;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.all = defaults.all;
    	      this.includedPaths = defaults.includedPaths;
        }

        public Builder all(@Nullable Object all) {
            this.all = all;
            return this;
        }
        public Builder includedPaths(@Nullable List<String> includedPaths) {
            this.includedPaths = includedPaths;
            return this;
        }
        public Builder includedPaths(String... includedPaths) {
            return includedPaths(List.of(includedPaths));
        }        public LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternProperties build() {
            return new LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternProperties(all, includedPaths);
        }
    }
}
