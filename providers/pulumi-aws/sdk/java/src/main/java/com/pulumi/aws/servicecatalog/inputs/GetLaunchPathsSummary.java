// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicecatalog.inputs;

import com.pulumi.aws.servicecatalog.inputs.GetLaunchPathsSummaryConstraintSummary;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public final class GetLaunchPathsSummary extends com.pulumi.resources.InvokeArgs {

    public static final GetLaunchPathsSummary Empty = new GetLaunchPathsSummary();

    /**
     * Block for constraints on the portfolio-product relationship. See details below.
     * 
     */
    @Import(name="constraintSummaries", required=true)
    private List<GetLaunchPathsSummaryConstraintSummary> constraintSummaries;

    public List<GetLaunchPathsSummaryConstraintSummary> constraintSummaries() {
        return this.constraintSummaries;
    }

    /**
     * Name of the portfolio to which the path was assigned.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * Identifier of the product path.
     * 
     */
    @Import(name="pathId", required=true)
    private String pathId;

    public String pathId() {
        return this.pathId;
    }

    /**
     * Tags associated with this product path.
     * 
     */
    @Import(name="tags", required=true)
    private Map<String,String> tags;

    public Map<String,String> tags() {
        return this.tags;
    }

    private GetLaunchPathsSummary() {}

    private GetLaunchPathsSummary(GetLaunchPathsSummary $) {
        this.constraintSummaries = $.constraintSummaries;
        this.name = $.name;
        this.pathId = $.pathId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLaunchPathsSummary defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLaunchPathsSummary $;

        public Builder() {
            $ = new GetLaunchPathsSummary();
        }

        public Builder(GetLaunchPathsSummary defaults) {
            $ = new GetLaunchPathsSummary(Objects.requireNonNull(defaults));
        }

        public Builder constraintSummaries(List<GetLaunchPathsSummaryConstraintSummary> constraintSummaries) {
            $.constraintSummaries = constraintSummaries;
            return this;
        }

        public Builder constraintSummaries(GetLaunchPathsSummaryConstraintSummary... constraintSummaries) {
            return constraintSummaries(List.of(constraintSummaries));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder pathId(String pathId) {
            $.pathId = pathId;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetLaunchPathsSummary build() {
            $.constraintSummaries = Objects.requireNonNull($.constraintSummaries, "expected parameter 'constraintSummaries' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.pathId = Objects.requireNonNull($.pathId, "expected parameter 'pathId' to be non-null");
            $.tags = Objects.requireNonNull($.tags, "expected parameter 'tags' to be non-null");
            return $;
        }
    }

}
