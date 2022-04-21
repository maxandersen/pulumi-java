// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mq.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BrokerUserGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final BrokerUserGetArgs Empty = new BrokerUserGetArgs();

    /**
     * Whether to enable access to the [ActiveMQ Web Console](http://activemq.apache.org/web-console.html) for the user. Applies to `engine_type` of `ActiveMQ` only.
     * 
     */
    @Import(name="consoleAccess")
    private @Nullable Output<Boolean> consoleAccess;

    public Optional<Output<Boolean>> consoleAccess() {
        return Optional.ofNullable(this.consoleAccess);
    }

    /**
     * List of groups (20 maximum) to which the ActiveMQ user belongs. Applies to `engine_type` of `ActiveMQ` only.
     * 
     */
    @Import(name="groups")
    private @Nullable Output<List<String>> groups;

    public Optional<Output<List<String>>> groups() {
        return Optional.ofNullable(this.groups);
    }

    /**
     * Password of the user. It must be 12 to 250 characters long, at least 4 unique characters, and must not contain commas.
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    public Output<String> password() {
        return this.password;
    }

    /**
     * Username of the user.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    public Output<String> username() {
        return this.username;
    }

    private BrokerUserGetArgs() {}

    private BrokerUserGetArgs(BrokerUserGetArgs $) {
        this.consoleAccess = $.consoleAccess;
        this.groups = $.groups;
        this.password = $.password;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BrokerUserGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BrokerUserGetArgs $;

        public Builder() {
            $ = new BrokerUserGetArgs();
        }

        public Builder(BrokerUserGetArgs defaults) {
            $ = new BrokerUserGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder consoleAccess(@Nullable Output<Boolean> consoleAccess) {
            $.consoleAccess = consoleAccess;
            return this;
        }

        public Builder consoleAccess(Boolean consoleAccess) {
            return consoleAccess(Output.of(consoleAccess));
        }

        public Builder groups(@Nullable Output<List<String>> groups) {
            $.groups = groups;
            return this;
        }

        public Builder groups(List<String> groups) {
            return groups(Output.of(groups));
        }

        public Builder groups(String... groups) {
            return groups(List.of(groups));
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

        public BrokerUserGetArgs build() {
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
