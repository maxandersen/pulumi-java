// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TopicRuleDynamoDBAction {
    private final String hashKeyField;
    private final @Nullable String hashKeyType;
    private final String hashKeyValue;
    private final @Nullable String payloadField;
    private final @Nullable String rangeKeyField;
    private final @Nullable String rangeKeyType;
    private final @Nullable String rangeKeyValue;
    private final String roleArn;
    private final String tableName;

    @CustomType.Constructor
    private TopicRuleDynamoDBAction(
        @CustomType.Parameter("hashKeyField") String hashKeyField,
        @CustomType.Parameter("hashKeyType") @Nullable String hashKeyType,
        @CustomType.Parameter("hashKeyValue") String hashKeyValue,
        @CustomType.Parameter("payloadField") @Nullable String payloadField,
        @CustomType.Parameter("rangeKeyField") @Nullable String rangeKeyField,
        @CustomType.Parameter("rangeKeyType") @Nullable String rangeKeyType,
        @CustomType.Parameter("rangeKeyValue") @Nullable String rangeKeyValue,
        @CustomType.Parameter("roleArn") String roleArn,
        @CustomType.Parameter("tableName") String tableName) {
        this.hashKeyField = hashKeyField;
        this.hashKeyType = hashKeyType;
        this.hashKeyValue = hashKeyValue;
        this.payloadField = payloadField;
        this.rangeKeyField = rangeKeyField;
        this.rangeKeyType = rangeKeyType;
        this.rangeKeyValue = rangeKeyValue;
        this.roleArn = roleArn;
        this.tableName = tableName;
    }

    public String hashKeyField() {
        return this.hashKeyField;
    }
    public Optional<String> hashKeyType() {
        return Optional.ofNullable(this.hashKeyType);
    }
    public String hashKeyValue() {
        return this.hashKeyValue;
    }
    public Optional<String> payloadField() {
        return Optional.ofNullable(this.payloadField);
    }
    public Optional<String> rangeKeyField() {
        return Optional.ofNullable(this.rangeKeyField);
    }
    public Optional<String> rangeKeyType() {
        return Optional.ofNullable(this.rangeKeyType);
    }
    public Optional<String> rangeKeyValue() {
        return Optional.ofNullable(this.rangeKeyValue);
    }
    public String roleArn() {
        return this.roleArn;
    }
    public String tableName() {
        return this.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleDynamoDBAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hashKeyField;
        private @Nullable String hashKeyType;
        private String hashKeyValue;
        private @Nullable String payloadField;
        private @Nullable String rangeKeyField;
        private @Nullable String rangeKeyType;
        private @Nullable String rangeKeyValue;
        private String roleArn;
        private String tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleDynamoDBAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hashKeyField = defaults.hashKeyField;
    	      this.hashKeyType = defaults.hashKeyType;
    	      this.hashKeyValue = defaults.hashKeyValue;
    	      this.payloadField = defaults.payloadField;
    	      this.rangeKeyField = defaults.rangeKeyField;
    	      this.rangeKeyType = defaults.rangeKeyType;
    	      this.rangeKeyValue = defaults.rangeKeyValue;
    	      this.roleArn = defaults.roleArn;
    	      this.tableName = defaults.tableName;
        }

        public Builder hashKeyField(String hashKeyField) {
            this.hashKeyField = Objects.requireNonNull(hashKeyField);
            return this;
        }
        public Builder hashKeyType(@Nullable String hashKeyType) {
            this.hashKeyType = hashKeyType;
            return this;
        }
        public Builder hashKeyValue(String hashKeyValue) {
            this.hashKeyValue = Objects.requireNonNull(hashKeyValue);
            return this;
        }
        public Builder payloadField(@Nullable String payloadField) {
            this.payloadField = payloadField;
            return this;
        }
        public Builder rangeKeyField(@Nullable String rangeKeyField) {
            this.rangeKeyField = rangeKeyField;
            return this;
        }
        public Builder rangeKeyType(@Nullable String rangeKeyType) {
            this.rangeKeyType = rangeKeyType;
            return this;
        }
        public Builder rangeKeyValue(@Nullable String rangeKeyValue) {
            this.rangeKeyValue = rangeKeyValue;
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder tableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }        public TopicRuleDynamoDBAction build() {
            return new TopicRuleDynamoDBAction(hashKeyField, hashKeyType, hashKeyValue, payloadField, rangeKeyField, rangeKeyType, rangeKeyValue, roleArn, tableName);
        }
    }
}
