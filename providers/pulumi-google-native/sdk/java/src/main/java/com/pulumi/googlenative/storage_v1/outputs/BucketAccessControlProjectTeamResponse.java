// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BucketAccessControlProjectTeamResponse {
    /**
     * The project number.
     * 
     */
    private final String projectNumber;
    /**
     * The team.
     * 
     */
    private final String team;

    @CustomType.Constructor
    private BucketAccessControlProjectTeamResponse(
        @CustomType.Parameter("projectNumber") String projectNumber,
        @CustomType.Parameter("team") String team) {
        this.projectNumber = projectNumber;
        this.team = team;
    }

    /**
     * The project number.
     * 
    */
    public String projectNumber() {
        return this.projectNumber;
    }
    /**
     * The team.
     * 
    */
    public String team() {
        return this.team;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketAccessControlProjectTeamResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String projectNumber;
        private String team;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketAccessControlProjectTeamResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.projectNumber = defaults.projectNumber;
    	      this.team = defaults.team;
        }

        public Builder projectNumber(String projectNumber) {
            this.projectNumber = Objects.requireNonNull(projectNumber);
            return this;
        }
        public Builder team(String team) {
            this.team = Objects.requireNonNull(team);
            return this;
        }        public BucketAccessControlProjectTeamResponse build() {
            return new BucketAccessControlProjectTeamResponse(projectNumber, team);
        }
    }
}
