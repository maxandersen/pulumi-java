// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.auditmanager;

import com.pulumi.awsnative.auditmanager.enums.AssessmentStatus;
import com.pulumi.awsnative.auditmanager.inputs.AssessmentAWSAccountArgs;
import com.pulumi.awsnative.auditmanager.inputs.AssessmentReportsDestinationArgs;
import com.pulumi.awsnative.auditmanager.inputs.AssessmentRoleArgs;
import com.pulumi.awsnative.auditmanager.inputs.AssessmentScopeArgs;
import com.pulumi.awsnative.auditmanager.inputs.AssessmentTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AssessmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final AssessmentArgs Empty = new AssessmentArgs();

    @Import(name="assessmentReportsDestination")
      private final @Nullable Output<AssessmentReportsDestinationArgs> assessmentReportsDestination;

    public Output<AssessmentReportsDestinationArgs> assessmentReportsDestination() {
        return this.assessmentReportsDestination == null ? Codegen.empty() : this.assessmentReportsDestination;
    }

    @Import(name="awsAccount")
      private final @Nullable Output<AssessmentAWSAccountArgs> awsAccount;

    public Output<AssessmentAWSAccountArgs> awsAccount() {
        return this.awsAccount == null ? Codegen.empty() : this.awsAccount;
    }

    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    @Import(name="frameworkId")
      private final @Nullable Output<String> frameworkId;

    public Output<String> frameworkId() {
        return this.frameworkId == null ? Codegen.empty() : this.frameworkId;
    }

    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The list of roles for the specified assessment.
     * 
     */
    @Import(name="roles")
      private final @Nullable Output<List<AssessmentRoleArgs>> roles;

    public Output<List<AssessmentRoleArgs>> roles() {
        return this.roles == null ? Codegen.empty() : this.roles;
    }

    @Import(name="scope")
      private final @Nullable Output<AssessmentScopeArgs> scope;

    public Output<AssessmentScopeArgs> scope() {
        return this.scope == null ? Codegen.empty() : this.scope;
    }

    @Import(name="status")
      private final @Nullable Output<AssessmentStatus> status;

    public Output<AssessmentStatus> status() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    /**
     * The tags associated with the assessment.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<AssessmentTagArgs>> tags;

    public Output<List<AssessmentTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public AssessmentArgs(
        @Nullable Output<AssessmentReportsDestinationArgs> assessmentReportsDestination,
        @Nullable Output<AssessmentAWSAccountArgs> awsAccount,
        @Nullable Output<String> description,
        @Nullable Output<String> frameworkId,
        @Nullable Output<String> name,
        @Nullable Output<List<AssessmentRoleArgs>> roles,
        @Nullable Output<AssessmentScopeArgs> scope,
        @Nullable Output<AssessmentStatus> status,
        @Nullable Output<List<AssessmentTagArgs>> tags) {
        this.assessmentReportsDestination = assessmentReportsDestination;
        this.awsAccount = awsAccount;
        this.description = description;
        this.frameworkId = frameworkId;
        this.name = name;
        this.roles = roles;
        this.scope = scope;
        this.status = status;
        this.tags = tags;
    }

    private AssessmentArgs() {
        this.assessmentReportsDestination = Codegen.empty();
        this.awsAccount = Codegen.empty();
        this.description = Codegen.empty();
        this.frameworkId = Codegen.empty();
        this.name = Codegen.empty();
        this.roles = Codegen.empty();
        this.scope = Codegen.empty();
        this.status = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssessmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AssessmentReportsDestinationArgs> assessmentReportsDestination;
        private @Nullable Output<AssessmentAWSAccountArgs> awsAccount;
        private @Nullable Output<String> description;
        private @Nullable Output<String> frameworkId;
        private @Nullable Output<String> name;
        private @Nullable Output<List<AssessmentRoleArgs>> roles;
        private @Nullable Output<AssessmentScopeArgs> scope;
        private @Nullable Output<AssessmentStatus> status;
        private @Nullable Output<List<AssessmentTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(AssessmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assessmentReportsDestination = defaults.assessmentReportsDestination;
    	      this.awsAccount = defaults.awsAccount;
    	      this.description = defaults.description;
    	      this.frameworkId = defaults.frameworkId;
    	      this.name = defaults.name;
    	      this.roles = defaults.roles;
    	      this.scope = defaults.scope;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
        }

        public Builder assessmentReportsDestination(@Nullable Output<AssessmentReportsDestinationArgs> assessmentReportsDestination) {
            this.assessmentReportsDestination = assessmentReportsDestination;
            return this;
        }
        public Builder assessmentReportsDestination(@Nullable AssessmentReportsDestinationArgs assessmentReportsDestination) {
            this.assessmentReportsDestination = Codegen.ofNullable(assessmentReportsDestination);
            return this;
        }
        public Builder awsAccount(@Nullable Output<AssessmentAWSAccountArgs> awsAccount) {
            this.awsAccount = awsAccount;
            return this;
        }
        public Builder awsAccount(@Nullable AssessmentAWSAccountArgs awsAccount) {
            this.awsAccount = Codegen.ofNullable(awsAccount);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder frameworkId(@Nullable Output<String> frameworkId) {
            this.frameworkId = frameworkId;
            return this;
        }
        public Builder frameworkId(@Nullable String frameworkId) {
            this.frameworkId = Codegen.ofNullable(frameworkId);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder roles(@Nullable Output<List<AssessmentRoleArgs>> roles) {
            this.roles = roles;
            return this;
        }
        public Builder roles(@Nullable List<AssessmentRoleArgs> roles) {
            this.roles = Codegen.ofNullable(roles);
            return this;
        }
        public Builder roles(AssessmentRoleArgs... roles) {
            return roles(List.of(roles));
        }
        public Builder scope(@Nullable Output<AssessmentScopeArgs> scope) {
            this.scope = scope;
            return this;
        }
        public Builder scope(@Nullable AssessmentScopeArgs scope) {
            this.scope = Codegen.ofNullable(scope);
            return this;
        }
        public Builder status(@Nullable Output<AssessmentStatus> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable AssessmentStatus status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }
        public Builder tags(@Nullable Output<List<AssessmentTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<AssessmentTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(AssessmentTagArgs... tags) {
            return tags(List.of(tags));
        }        public AssessmentArgs build() {
            return new AssessmentArgs(assessmentReportsDestination, awsAccount, description, frameworkId, name, roles, scope, status, tags);
        }
    }
}
