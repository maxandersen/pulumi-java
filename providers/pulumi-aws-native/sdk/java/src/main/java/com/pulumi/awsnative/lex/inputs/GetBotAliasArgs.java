// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBotAliasArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBotAliasArgs Empty = new GetBotAliasArgs();

    @Import(name="botAliasId", required=true)
    private String botAliasId;

    public String botAliasId() {
        return this.botAliasId;
    }

    @Import(name="botId", required=true)
    private String botId;

    public String botId() {
        return this.botId;
    }

    private GetBotAliasArgs() {}

    private GetBotAliasArgs(GetBotAliasArgs $) {
        this.botAliasId = $.botAliasId;
        this.botId = $.botId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBotAliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBotAliasArgs $;

        public Builder() {
            $ = new GetBotAliasArgs();
        }

        public Builder(GetBotAliasArgs defaults) {
            $ = new GetBotAliasArgs(Objects.requireNonNull(defaults));
        }

        public Builder botAliasId(String botAliasId) {
            $.botAliasId = botAliasId;
            return this;
        }

        public Builder botId(String botId) {
            $.botId = botId;
            return this;
        }

        public GetBotAliasArgs build() {
            $.botAliasId = Objects.requireNonNull($.botAliasId, "expected parameter 'botAliasId' to be non-null");
            $.botId = Objects.requireNonNull($.botId, "expected parameter 'botId' to be non-null");
            return $;
        }
    }

}
