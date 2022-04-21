// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.auditmanager.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The AWS account associated with the assessment.
 * 
 */
public final class AssessmentAWSAccount extends com.pulumi.resources.InvokeArgs {

    public static final AssessmentAWSAccount Empty = new AssessmentAWSAccount();

    @Import(name="emailAddress")
    private @Nullable String emailAddress;

    public Optional<String> emailAddress() {
        return Optional.ofNullable(this.emailAddress);
    }

    @Import(name="id")
    private @Nullable String id;

    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    private AssessmentAWSAccount() {}

    private AssessmentAWSAccount(AssessmentAWSAccount $) {
        this.emailAddress = $.emailAddress;
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AssessmentAWSAccount defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AssessmentAWSAccount $;

        public Builder() {
            $ = new AssessmentAWSAccount();
        }

        public Builder(AssessmentAWSAccount defaults) {
            $ = new AssessmentAWSAccount(Objects.requireNonNull(defaults));
        }

        public Builder emailAddress(@Nullable String emailAddress) {
            $.emailAddress = emailAddress;
            return this;
        }

        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public AssessmentAWSAccount build() {
            return $;
        }
    }

}
