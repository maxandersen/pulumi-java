// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudtrail.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class TrailEventSelectorDataResource {
    /**
     * Resource type in which you want to log data events. You can specify only the following value: &#34;AWS::S3::Object&#34;, &#34;AWS::Lambda::Function&#34; and &#34;AWS::DynamoDB::Table&#34;.
     * 
     */
    private final String type;
    /**
     * List of ARN strings or partial ARN strings to specify selectors for data audit events over data resources. ARN list is specific to single-valued `type`. For example, `arn:aws:s3:::&lt;bucket name&gt;/` for all objects in a bucket, `arn:aws:s3:::&lt;bucket name&gt;/key` for specific objects, `arn:aws:lambda` for all lambda events within an account, `arn:aws:lambda:&lt;region&gt;:&lt;account number&gt;:function:&lt;function name&gt;` for a specific Lambda function, `arn:aws:dynamodb` for all DDB events for all tables within an account, or `arn:aws:dynamodb:&lt;region&gt;:&lt;account number&gt;:table/&lt;table name&gt;` for a specific DynamoDB table.
     * 
     */
    private final List<String> values;

    @CustomType.Constructor
    private TrailEventSelectorDataResource(
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("values") List<String> values) {
        this.type = type;
        this.values = values;
    }

    /**
     * Resource type in which you want to log data events. You can specify only the following value: &#34;AWS::S3::Object&#34;, &#34;AWS::Lambda::Function&#34; and &#34;AWS::DynamoDB::Table&#34;.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * List of ARN strings or partial ARN strings to specify selectors for data audit events over data resources. ARN list is specific to single-valued `type`. For example, `arn:aws:s3:::&lt;bucket name&gt;/` for all objects in a bucket, `arn:aws:s3:::&lt;bucket name&gt;/key` for specific objects, `arn:aws:lambda` for all lambda events within an account, `arn:aws:lambda:&lt;region&gt;:&lt;account number&gt;:function:&lt;function name&gt;` for a specific Lambda function, `arn:aws:dynamodb` for all DDB events for all tables within an account, or `arn:aws:dynamodb:&lt;region&gt;:&lt;account number&gt;:table/&lt;table name&gt;` for a specific DynamoDB table.
     * 
    */
    public List<String> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrailEventSelectorDataResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(TrailEventSelectorDataResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.values = defaults.values;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public TrailEventSelectorDataResource build() {
            return new TrailEventSelectorDataResource(type, values);
        }
    }
}
