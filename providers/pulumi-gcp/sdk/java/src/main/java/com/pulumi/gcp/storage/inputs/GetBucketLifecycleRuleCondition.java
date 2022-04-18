// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetBucketLifecycleRuleCondition extends com.pulumi.resources.InvokeArgs {

    public static final GetBucketLifecycleRuleCondition Empty = new GetBucketLifecycleRuleCondition();

    @Import(name="age", required=true)
      private final Integer age;

    public Integer age() {
        return this.age;
    }

    @Import(name="createdBefore", required=true)
      private final String createdBefore;

    public String createdBefore() {
        return this.createdBefore;
    }

    @Import(name="customTimeBefore", required=true)
      private final String customTimeBefore;

    public String customTimeBefore() {
        return this.customTimeBefore;
    }

    @Import(name="daysSinceCustomTime", required=true)
      private final Integer daysSinceCustomTime;

    public Integer daysSinceCustomTime() {
        return this.daysSinceCustomTime;
    }

    @Import(name="daysSinceNoncurrentTime", required=true)
      private final Integer daysSinceNoncurrentTime;

    public Integer daysSinceNoncurrentTime() {
        return this.daysSinceNoncurrentTime;
    }

    @Import(name="matchesStorageClasses", required=true)
      private final List<String> matchesStorageClasses;

    public List<String> matchesStorageClasses() {
        return this.matchesStorageClasses;
    }

    @Import(name="noncurrentTimeBefore", required=true)
      private final String noncurrentTimeBefore;

    public String noncurrentTimeBefore() {
        return this.noncurrentTimeBefore;
    }

    @Import(name="numNewerVersions", required=true)
      private final Integer numNewerVersions;

    public Integer numNewerVersions() {
        return this.numNewerVersions;
    }

    @Import(name="withState", required=true)
      private final String withState;

    public String withState() {
        return this.withState;
    }

    public GetBucketLifecycleRuleCondition(
        Integer age,
        String createdBefore,
        String customTimeBefore,
        Integer daysSinceCustomTime,
        Integer daysSinceNoncurrentTime,
        List<String> matchesStorageClasses,
        String noncurrentTimeBefore,
        Integer numNewerVersions,
        String withState) {
        this.age = Objects.requireNonNull(age, "expected parameter 'age' to be non-null");
        this.createdBefore = Objects.requireNonNull(createdBefore, "expected parameter 'createdBefore' to be non-null");
        this.customTimeBefore = Objects.requireNonNull(customTimeBefore, "expected parameter 'customTimeBefore' to be non-null");
        this.daysSinceCustomTime = Objects.requireNonNull(daysSinceCustomTime, "expected parameter 'daysSinceCustomTime' to be non-null");
        this.daysSinceNoncurrentTime = Objects.requireNonNull(daysSinceNoncurrentTime, "expected parameter 'daysSinceNoncurrentTime' to be non-null");
        this.matchesStorageClasses = Objects.requireNonNull(matchesStorageClasses, "expected parameter 'matchesStorageClasses' to be non-null");
        this.noncurrentTimeBefore = Objects.requireNonNull(noncurrentTimeBefore, "expected parameter 'noncurrentTimeBefore' to be non-null");
        this.numNewerVersions = Objects.requireNonNull(numNewerVersions, "expected parameter 'numNewerVersions' to be non-null");
        this.withState = Objects.requireNonNull(withState, "expected parameter 'withState' to be non-null");
    }

    private GetBucketLifecycleRuleCondition() {
        this.age = null;
        this.createdBefore = null;
        this.customTimeBefore = null;
        this.daysSinceCustomTime = null;
        this.daysSinceNoncurrentTime = null;
        this.matchesStorageClasses = List.of();
        this.noncurrentTimeBefore = null;
        this.numNewerVersions = null;
        this.withState = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketLifecycleRuleCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer age;
        private String createdBefore;
        private String customTimeBefore;
        private Integer daysSinceCustomTime;
        private Integer daysSinceNoncurrentTime;
        private List<String> matchesStorageClasses;
        private String noncurrentTimeBefore;
        private Integer numNewerVersions;
        private String withState;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBucketLifecycleRuleCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.age = defaults.age;
    	      this.createdBefore = defaults.createdBefore;
    	      this.customTimeBefore = defaults.customTimeBefore;
    	      this.daysSinceCustomTime = defaults.daysSinceCustomTime;
    	      this.daysSinceNoncurrentTime = defaults.daysSinceNoncurrentTime;
    	      this.matchesStorageClasses = defaults.matchesStorageClasses;
    	      this.noncurrentTimeBefore = defaults.noncurrentTimeBefore;
    	      this.numNewerVersions = defaults.numNewerVersions;
    	      this.withState = defaults.withState;
        }

        public Builder age(Integer age) {
            this.age = Objects.requireNonNull(age);
            return this;
        }
        public Builder createdBefore(String createdBefore) {
            this.createdBefore = Objects.requireNonNull(createdBefore);
            return this;
        }
        public Builder customTimeBefore(String customTimeBefore) {
            this.customTimeBefore = Objects.requireNonNull(customTimeBefore);
            return this;
        }
        public Builder daysSinceCustomTime(Integer daysSinceCustomTime) {
            this.daysSinceCustomTime = Objects.requireNonNull(daysSinceCustomTime);
            return this;
        }
        public Builder daysSinceNoncurrentTime(Integer daysSinceNoncurrentTime) {
            this.daysSinceNoncurrentTime = Objects.requireNonNull(daysSinceNoncurrentTime);
            return this;
        }
        public Builder matchesStorageClasses(List<String> matchesStorageClasses) {
            this.matchesStorageClasses = Objects.requireNonNull(matchesStorageClasses);
            return this;
        }
        public Builder matchesStorageClasses(String... matchesStorageClasses) {
            return matchesStorageClasses(List.of(matchesStorageClasses));
        }
        public Builder noncurrentTimeBefore(String noncurrentTimeBefore) {
            this.noncurrentTimeBefore = Objects.requireNonNull(noncurrentTimeBefore);
            return this;
        }
        public Builder numNewerVersions(Integer numNewerVersions) {
            this.numNewerVersions = Objects.requireNonNull(numNewerVersions);
            return this;
        }
        public Builder withState(String withState) {
            this.withState = Objects.requireNonNull(withState);
            return this;
        }        public GetBucketLifecycleRuleCondition build() {
            return new GetBucketLifecycleRuleCondition(age, createdBefore, customTimeBefore, daysSinceCustomTime, daysSinceNoncurrentTime, matchesStorageClasses, noncurrentTimeBefore, numNewerVersions, withState);
        }
    }
}
