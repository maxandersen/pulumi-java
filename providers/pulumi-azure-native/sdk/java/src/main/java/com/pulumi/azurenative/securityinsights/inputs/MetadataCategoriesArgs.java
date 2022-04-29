// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ies for the solution content item
 * 
 */
public final class MetadataCategoriesArgs extends ResourceArgs {

    public static final MetadataCategoriesArgs Empty = new MetadataCategoriesArgs();

    /**
     * domain for the solution content item
     * 
     */
    @Import(name="domains")
    private @Nullable Output<List<String>> domains;

    /**
     * @return domain for the solution content item
     * 
     */
    public Optional<Output<List<String>>> domains() {
        return Optional.ofNullable(this.domains);
    }

    /**
     * Industry verticals for the solution content item
     * 
     */
    @Import(name="verticals")
    private @Nullable Output<List<String>> verticals;

    /**
     * @return Industry verticals for the solution content item
     * 
     */
    public Optional<Output<List<String>>> verticals() {
        return Optional.ofNullable(this.verticals);
    }

    private MetadataCategoriesArgs() {}

    private MetadataCategoriesArgs(MetadataCategoriesArgs $) {
        this.domains = $.domains;
        this.verticals = $.verticals;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetadataCategoriesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetadataCategoriesArgs $;

        public Builder() {
            $ = new MetadataCategoriesArgs();
        }

        public Builder(MetadataCategoriesArgs defaults) {
            $ = new MetadataCategoriesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domains domain for the solution content item
         * 
         * @return builder
         * 
         */
        public Builder domains(@Nullable Output<List<String>> domains) {
            $.domains = domains;
            return this;
        }

        /**
         * @param domains domain for the solution content item
         * 
         * @return builder
         * 
         */
        public Builder domains(List<String> domains) {
            return domains(Output.of(domains));
        }

        /**
         * @param domains domain for the solution content item
         * 
         * @return builder
         * 
         */
        public Builder domains(String... domains) {
            return domains(List.of(domains));
        }

        /**
         * @param verticals Industry verticals for the solution content item
         * 
         * @return builder
         * 
         */
        public Builder verticals(@Nullable Output<List<String>> verticals) {
            $.verticals = verticals;
            return this;
        }

        /**
         * @param verticals Industry verticals for the solution content item
         * 
         * @return builder
         * 
         */
        public Builder verticals(List<String> verticals) {
            return verticals(Output.of(verticals));
        }

        /**
         * @param verticals Industry verticals for the solution content item
         * 
         * @return builder
         * 
         */
        public Builder verticals(String... verticals) {
            return verticals(List.of(verticals));
        }

        public MetadataCategoriesArgs build() {
            return $;
        }
    }

}
