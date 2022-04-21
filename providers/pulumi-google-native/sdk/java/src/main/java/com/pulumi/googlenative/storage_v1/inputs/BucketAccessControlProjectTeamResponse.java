// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The project team associated with the entity, if any.
 * 
 */
public final class BucketAccessControlProjectTeamResponse extends com.pulumi.resources.InvokeArgs {

    public static final BucketAccessControlProjectTeamResponse Empty = new BucketAccessControlProjectTeamResponse();

    /**
     * The project number.
     * 
     */
    @Import(name="projectNumber", required=true)
    private String projectNumber;

    public String projectNumber() {
        return this.projectNumber;
    }

    /**
     * The team.
     * 
     */
    @Import(name="team", required=true)
    private String team;

    public String team() {
        return this.team;
    }

    private BucketAccessControlProjectTeamResponse() {}

    private BucketAccessControlProjectTeamResponse(BucketAccessControlProjectTeamResponse $) {
        this.projectNumber = $.projectNumber;
        this.team = $.team;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketAccessControlProjectTeamResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketAccessControlProjectTeamResponse $;

        public Builder() {
            $ = new BucketAccessControlProjectTeamResponse();
        }

        public Builder(BucketAccessControlProjectTeamResponse defaults) {
            $ = new BucketAccessControlProjectTeamResponse(Objects.requireNonNull(defaults));
        }

        public Builder projectNumber(String projectNumber) {
            $.projectNumber = projectNumber;
            return this;
        }

        public Builder team(String team) {
            $.team = team;
            return this;
        }

        public BucketAccessControlProjectTeamResponse build() {
            $.projectNumber = Objects.requireNonNull($.projectNumber, "expected parameter 'projectNumber' to be non-null");
            $.team = Objects.requireNonNull($.team, "expected parameter 'team' to be non-null");
            return $;
        }
    }

}
