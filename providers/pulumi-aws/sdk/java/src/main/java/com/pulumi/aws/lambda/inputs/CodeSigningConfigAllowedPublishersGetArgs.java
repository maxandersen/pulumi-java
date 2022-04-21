// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lambda.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class CodeSigningConfigAllowedPublishersGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final CodeSigningConfigAllowedPublishersGetArgs Empty = new CodeSigningConfigAllowedPublishersGetArgs();

    /**
     * The Amazon Resource Name (ARN) for each of the signing profiles. A signing profile defines a trusted user who can sign a code package.
     * 
     */
    @Import(name="signingProfileVersionArns", required=true)
    private Output<List<String>> signingProfileVersionArns;

    public Output<List<String>> signingProfileVersionArns() {
        return this.signingProfileVersionArns;
    }

    private CodeSigningConfigAllowedPublishersGetArgs() {}

    private CodeSigningConfigAllowedPublishersGetArgs(CodeSigningConfigAllowedPublishersGetArgs $) {
        this.signingProfileVersionArns = $.signingProfileVersionArns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CodeSigningConfigAllowedPublishersGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CodeSigningConfigAllowedPublishersGetArgs $;

        public Builder() {
            $ = new CodeSigningConfigAllowedPublishersGetArgs();
        }

        public Builder(CodeSigningConfigAllowedPublishersGetArgs defaults) {
            $ = new CodeSigningConfigAllowedPublishersGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder signingProfileVersionArns(Output<List<String>> signingProfileVersionArns) {
            $.signingProfileVersionArns = signingProfileVersionArns;
            return this;
        }

        public Builder signingProfileVersionArns(List<String> signingProfileVersionArns) {
            return signingProfileVersionArns(Output.of(signingProfileVersionArns));
        }

        public Builder signingProfileVersionArns(String... signingProfileVersionArns) {
            return signingProfileVersionArns(List.of(signingProfileVersionArns));
        }

        public CodeSigningConfigAllowedPublishersGetArgs build() {
            $.signingProfileVersionArns = Objects.requireNonNull($.signingProfileVersionArns, "expected parameter 'signingProfileVersionArns' to be non-null");
            return $;
        }
    }

}
