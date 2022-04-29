// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Activity query definitions
 * 
 */
public final class ActivityEntityQueriesPropertiesQueryDefinitionsArgs extends ResourceArgs {

    public static final ActivityEntityQueriesPropertiesQueryDefinitionsArgs Empty = new ActivityEntityQueriesPropertiesQueryDefinitionsArgs();

    /**
     * The Activity query to run on a given entity
     * 
     */
    @Import(name="query")
    private @Nullable Output<String> query;

    /**
     * @return The Activity query to run on a given entity
     * 
     */
    public Optional<Output<String>> query() {
        return Optional.ofNullable(this.query);
    }

    private ActivityEntityQueriesPropertiesQueryDefinitionsArgs() {}

    private ActivityEntityQueriesPropertiesQueryDefinitionsArgs(ActivityEntityQueriesPropertiesQueryDefinitionsArgs $) {
        this.query = $.query;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ActivityEntityQueriesPropertiesQueryDefinitionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActivityEntityQueriesPropertiesQueryDefinitionsArgs $;

        public Builder() {
            $ = new ActivityEntityQueriesPropertiesQueryDefinitionsArgs();
        }

        public Builder(ActivityEntityQueriesPropertiesQueryDefinitionsArgs defaults) {
            $ = new ActivityEntityQueriesPropertiesQueryDefinitionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param query The Activity query to run on a given entity
         * 
         * @return builder
         * 
         */
        public Builder query(@Nullable Output<String> query) {
            $.query = query;
            return this;
        }

        /**
         * @param query The Activity query to run on a given entity
         * 
         * @return builder
         * 
         */
        public Builder query(String query) {
            return query(Output.of(query));
        }

        public ActivityEntityQueriesPropertiesQueryDefinitionsArgs build() {
            return $;
        }
    }

}
