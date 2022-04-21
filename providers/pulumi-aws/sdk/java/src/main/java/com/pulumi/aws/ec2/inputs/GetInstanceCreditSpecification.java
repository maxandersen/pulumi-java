// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetInstanceCreditSpecification extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceCreditSpecification Empty = new GetInstanceCreditSpecification();

    @Import(name="cpuCredits", required=true)
    private String cpuCredits;

    public String cpuCredits() {
        return this.cpuCredits;
    }

    private GetInstanceCreditSpecification() {}

    private GetInstanceCreditSpecification(GetInstanceCreditSpecification $) {
        this.cpuCredits = $.cpuCredits;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceCreditSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceCreditSpecification $;

        public Builder() {
            $ = new GetInstanceCreditSpecification();
        }

        public Builder(GetInstanceCreditSpecification defaults) {
            $ = new GetInstanceCreditSpecification(Objects.requireNonNull(defaults));
        }

        public Builder cpuCredits(String cpuCredits) {
            $.cpuCredits = cpuCredits;
            return this;
        }

        public GetInstanceCreditSpecification build() {
            $.cpuCredits = Objects.requireNonNull($.cpuCredits, "expected parameter 'cpuCredits' to be non-null");
            return $;
        }
    }

}
