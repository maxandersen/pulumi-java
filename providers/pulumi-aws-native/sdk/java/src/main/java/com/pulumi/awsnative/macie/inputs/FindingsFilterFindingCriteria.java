// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.macie.inputs;

import com.pulumi.awsnative.macie.inputs.FindingsFilterCriterion;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FindingsFilterFindingCriteria extends com.pulumi.resources.InvokeArgs {

    public static final FindingsFilterFindingCriteria Empty = new FindingsFilterFindingCriteria();

    @Import(name="criterion")
    private @Nullable FindingsFilterCriterion criterion;

    public Optional<FindingsFilterCriterion> criterion() {
        return Optional.ofNullable(this.criterion);
    }

    private FindingsFilterFindingCriteria() {}

    private FindingsFilterFindingCriteria(FindingsFilterFindingCriteria $) {
        this.criterion = $.criterion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FindingsFilterFindingCriteria defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FindingsFilterFindingCriteria $;

        public Builder() {
            $ = new FindingsFilterFindingCriteria();
        }

        public Builder(FindingsFilterFindingCriteria defaults) {
            $ = new FindingsFilterFindingCriteria(Objects.requireNonNull(defaults));
        }

        public Builder criterion(@Nullable FindingsFilterCriterion criterion) {
            $.criterion = criterion;
            return this;
        }

        public FindingsFilterFindingCriteria build() {
            return $;
        }
    }

}
