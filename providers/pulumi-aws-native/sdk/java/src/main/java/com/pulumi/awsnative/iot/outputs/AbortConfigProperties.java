// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.outputs;

import com.pulumi.awsnative.iot.outputs.JobTemplateAbortCriteria;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class AbortConfigProperties {
    private final List<JobTemplateAbortCriteria> criteriaList;

    @CustomType.Constructor
    private AbortConfigProperties(@CustomType.Parameter("criteriaList") List<JobTemplateAbortCriteria> criteriaList) {
        this.criteriaList = criteriaList;
    }

    public List<JobTemplateAbortCriteria> criteriaList() {
        return this.criteriaList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AbortConfigProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<JobTemplateAbortCriteria> criteriaList;

        public Builder() {
    	      // Empty
        }

        public Builder(AbortConfigProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.criteriaList = defaults.criteriaList;
        }

        public Builder criteriaList(List<JobTemplateAbortCriteria> criteriaList) {
            this.criteriaList = Objects.requireNonNull(criteriaList);
            return this;
        }
        public Builder criteriaList(JobTemplateAbortCriteria... criteriaList) {
            return criteriaList(List.of(criteriaList));
        }        public AbortConfigProperties build() {
            return new AbortConfigProperties(criteriaList);
        }
    }
}
