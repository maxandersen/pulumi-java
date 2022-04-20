// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.clouddeploy_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.clouddeploy_v1.inputs.DefaultPoolResponse;
import com.pulumi.googlenative.clouddeploy_v1.inputs.PrivatePoolResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Configuration of the environment to use when calling Skaffold.
 * 
 */
public final class ExecutionConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final ExecutionConfigResponse Empty = new ExecutionConfigResponse();

    /**
     * Optional. Cloud Storage location where execution outputs should be stored. This can either be a bucket (&#34;gs://my-bucket&#34;) or a path within a bucket (&#34;gs://my-bucket/my-dir&#34;). If unspecified, a default bucket located in the same region will be used.
     * 
     */
    @Import(name="artifactStorage", required=true)
      private final String artifactStorage;

    public String artifactStorage() {
        return this.artifactStorage;
    }

    /**
     * Optional. Use default Cloud Build pool.
     * 
     */
    @Import(name="defaultPool", required=true)
      private final DefaultPoolResponse defaultPool;

    public DefaultPoolResponse defaultPool() {
        return this.defaultPool;
    }

    /**
     * Optional. Use private Cloud Build pool.
     * 
     */
    @Import(name="privatePool", required=true)
      private final PrivatePoolResponse privatePool;

    public PrivatePoolResponse privatePool() {
        return this.privatePool;
    }

    /**
     * Optional. Google service account to use for execution. If unspecified, the project execution service account (-compute@developer.gserviceaccount.com) will be used.
     * 
     */
    @Import(name="serviceAccount", required=true)
      private final String serviceAccount;

    public String serviceAccount() {
        return this.serviceAccount;
    }

    /**
     * Usages when this configuration should be applied.
     * 
     */
    @Import(name="usages", required=true)
      private final List<String> usages;

    public List<String> usages() {
        return this.usages;
    }

    /**
     * Optional. The resource name of the `WorkerPool`, with the format `projects/{project}/locations/{location}/workerPools/{worker_pool}`. If this optional field is unspecified, the default Cloud Build pool will be used.
     * 
     */
    @Import(name="workerPool", required=true)
      private final String workerPool;

    public String workerPool() {
        return this.workerPool;
    }

    public ExecutionConfigResponse(
        String artifactStorage,
        DefaultPoolResponse defaultPool,
        PrivatePoolResponse privatePool,
        String serviceAccount,
        List<String> usages,
        String workerPool) {
        this.artifactStorage = Objects.requireNonNull(artifactStorage, "expected parameter 'artifactStorage' to be non-null");
        this.defaultPool = Objects.requireNonNull(defaultPool, "expected parameter 'defaultPool' to be non-null");
        this.privatePool = Objects.requireNonNull(privatePool, "expected parameter 'privatePool' to be non-null");
        this.serviceAccount = Objects.requireNonNull(serviceAccount, "expected parameter 'serviceAccount' to be non-null");
        this.usages = Objects.requireNonNull(usages, "expected parameter 'usages' to be non-null");
        this.workerPool = Objects.requireNonNull(workerPool, "expected parameter 'workerPool' to be non-null");
    }

    private ExecutionConfigResponse() {
        this.artifactStorage = null;
        this.defaultPool = null;
        this.privatePool = null;
        this.serviceAccount = null;
        this.usages = List.of();
        this.workerPool = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecutionConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String artifactStorage;
        private DefaultPoolResponse defaultPool;
        private PrivatePoolResponse privatePool;
        private String serviceAccount;
        private List<String> usages;
        private String workerPool;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecutionConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactStorage = defaults.artifactStorage;
    	      this.defaultPool = defaults.defaultPool;
    	      this.privatePool = defaults.privatePool;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.usages = defaults.usages;
    	      this.workerPool = defaults.workerPool;
        }

        public Builder artifactStorage(String artifactStorage) {
            this.artifactStorage = Objects.requireNonNull(artifactStorage);
            return this;
        }
        public Builder defaultPool(DefaultPoolResponse defaultPool) {
            this.defaultPool = Objects.requireNonNull(defaultPool);
            return this;
        }
        public Builder privatePool(PrivatePoolResponse privatePool) {
            this.privatePool = Objects.requireNonNull(privatePool);
            return this;
        }
        public Builder serviceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }
        public Builder usages(List<String> usages) {
            this.usages = Objects.requireNonNull(usages);
            return this;
        }
        public Builder usages(String... usages) {
            return usages(List.of(usages));
        }
        public Builder workerPool(String workerPool) {
            this.workerPool = Objects.requireNonNull(workerPool);
            return this;
        }        public ExecutionConfigResponse build() {
            return new ExecutionConfigResponse(artifactStorage, defaultPool, privatePool, serviceAccount, usages, workerPool);
        }
    }
}
