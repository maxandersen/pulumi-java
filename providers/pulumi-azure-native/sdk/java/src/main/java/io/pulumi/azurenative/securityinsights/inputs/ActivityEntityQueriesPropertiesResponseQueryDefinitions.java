// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Activity query definitions
 * 
 */
public final class ActivityEntityQueriesPropertiesResponseQueryDefinitions extends io.pulumi.resources.InvokeArgs {

    public static final ActivityEntityQueriesPropertiesResponseQueryDefinitions Empty = new ActivityEntityQueriesPropertiesResponseQueryDefinitions();

    /**
     * The Activity query to run on a given entity
     * 
     */
    @Import(name="query")
      private final @Nullable String query;

    public Optional<String> query() {
        return this.query == null ? Optional.empty() : Optional.ofNullable(this.query);
    }

    public ActivityEntityQueriesPropertiesResponseQueryDefinitions(@Nullable String query) {
        this.query = query;
    }

    private ActivityEntityQueriesPropertiesResponseQueryDefinitions() {
        this.query = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActivityEntityQueriesPropertiesResponseQueryDefinitions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String query;

        public Builder() {
    	      // Empty
        }

        public Builder(ActivityEntityQueriesPropertiesResponseQueryDefinitions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.query = defaults.query;
        }

        public Builder query(@Nullable String query) {
            this.query = query;
            return this;
        }        public ActivityEntityQueriesPropertiesResponseQueryDefinitions build() {
            return new ActivityEntityQueriesPropertiesResponseQueryDefinitions(query);
        }
    }
}
