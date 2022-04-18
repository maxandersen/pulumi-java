// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3objectlambda;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;


public final class AccessPointPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessPointPolicyArgs Empty = new AccessPointPolicyArgs();

    /**
     * The name of the Amazon S3 ObjectLambdaAccessPoint to which the policy applies.
     * 
     */
    @Import(name="objectLambdaAccessPoint", required=true)
      private final Output<String> objectLambdaAccessPoint;

    public Output<String> objectLambdaAccessPoint() {
        return this.objectLambdaAccessPoint;
    }

    /**
     * A policy document containing permissions to add to the specified ObjectLambdaAccessPoint. For more information, see Access Policy Language Overview (https://docs.aws.amazon.com/AmazonS3/latest/dev/access-policy-language-overview.html) in the Amazon Simple Storage Service Developer Guide.
     * 
     */
    @Import(name="policyDocument", required=true)
      private final Output<Object> policyDocument;

    public Output<Object> policyDocument() {
        return this.policyDocument;
    }

    public AccessPointPolicyArgs(
        Output<String> objectLambdaAccessPoint,
        Output<Object> policyDocument) {
        this.objectLambdaAccessPoint = Objects.requireNonNull(objectLambdaAccessPoint, "expected parameter 'objectLambdaAccessPoint' to be non-null");
        this.policyDocument = Objects.requireNonNull(policyDocument, "expected parameter 'policyDocument' to be non-null");
    }

    private AccessPointPolicyArgs() {
        this.objectLambdaAccessPoint = Codegen.empty();
        this.policyDocument = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPointPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> objectLambdaAccessPoint;
        private Output<Object> policyDocument;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPointPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectLambdaAccessPoint = defaults.objectLambdaAccessPoint;
    	      this.policyDocument = defaults.policyDocument;
        }

        public Builder objectLambdaAccessPoint(Output<String> objectLambdaAccessPoint) {
            this.objectLambdaAccessPoint = Objects.requireNonNull(objectLambdaAccessPoint);
            return this;
        }
        public Builder objectLambdaAccessPoint(String objectLambdaAccessPoint) {
            this.objectLambdaAccessPoint = Output.of(Objects.requireNonNull(objectLambdaAccessPoint));
            return this;
        }
        public Builder policyDocument(Output<Object> policyDocument) {
            this.policyDocument = Objects.requireNonNull(policyDocument);
            return this;
        }
        public Builder policyDocument(Object policyDocument) {
            this.policyDocument = Output.of(Objects.requireNonNull(policyDocument));
            return this;
        }        public AccessPointPolicyArgs build() {
            return new AccessPointPolicyArgs(objectLambdaAccessPoint, policyDocument);
        }
    }
}
