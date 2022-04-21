// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class EventConnectionAuthParametersBasicArgs extends com.pulumi.resources.ResourceArgs {

    public static final EventConnectionAuthParametersBasicArgs Empty = new EventConnectionAuthParametersBasicArgs();

    /**
     * A password for the authorization. Created and stored in AWS Secrets Manager.
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    public Output<String> password() {
        return this.password;
    }

    /**
     * A username for the authorization.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    public Output<String> username() {
        return this.username;
    }

    private EventConnectionAuthParametersBasicArgs() {}

    private EventConnectionAuthParametersBasicArgs(EventConnectionAuthParametersBasicArgs $) {
        this.password = $.password;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EventConnectionAuthParametersBasicArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EventConnectionAuthParametersBasicArgs $;

        public Builder() {
            $ = new EventConnectionAuthParametersBasicArgs();
        }

        public Builder(EventConnectionAuthParametersBasicArgs defaults) {
            $ = new EventConnectionAuthParametersBasicArgs(Objects.requireNonNull(defaults));
        }

        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        public Builder password(String password) {
            return password(Output.of(password));
        }

        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        public Builder username(String username) {
            return username(Output.of(username));
        }

        public EventConnectionAuthParametersBasicArgs build() {
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
